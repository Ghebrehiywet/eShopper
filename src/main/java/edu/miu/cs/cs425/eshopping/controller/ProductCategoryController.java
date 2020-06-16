package edu.miu.cs.cs425.eshopping.controller;

import edu.miu.cs.cs425.eshopping.model.*;
import edu.miu.cs.cs425.eshopping.service.CategoryService;
import edu.miu.cs.cs425.eshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.security.Principal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@Secured("ADMIN")
@PreAuthorize("hasAuthority('ADMIN')")
@Controller
@RequestMapping("/category")
public class ProductCategoryController {
    private final CategoryService categoryService;
    private final ProductService productService;

    public ProductCategoryController(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }


    @RequestMapping("/list")
    public String list(Model model) {
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "productcategory/list";
    }

    @GetMapping("/create")
    public String createCategory(@ModelAttribute("category") Category category) {
        return "productcategory/create";
    }

    @PostMapping(value = "/create")
    public String saveCategory(@Valid Category category, BindingResult result, Model model,
                               RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "productcategory/create";
        }
        categoryService.save(category);
        redirectAttributes.addFlashAttribute("successMessage", category.getCategoryName() + " is added.");

        return "redirect:/category/list";
    }

    @GetMapping("/update/{id}")
    public String updateCategory(@PathVariable("id") Long id, Model model) {
        Category category = categoryService.findById(id);
        model.addAttribute("category", category);
        return "productcategory/update";
    }

    @PostMapping(value = "/update")
    public String updateCategory(@Valid Category category, BindingResult result, Model model,
                                 RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "productcategory/update";
        }
        categoryService.put(category);
        redirectAttributes.addFlashAttribute("successMessage", category.getCategoryName() + " is updated.");

        return "redirect:/category/list";
    }

    @GetMapping("/delete")
    public String deleteProduct(@RequestParam("id") Long categoryId, Model model, Principal principal, RedirectAttributes redirectAttributes) {
        Category category;
        List<Product> products;
        try {
            category = categoryService.findById(categoryId);
            products = productService.findAllByCategory(category);

            if (products.size() >= 1) {
                redirectAttributes.addFlashAttribute("errorMessage", "You can not deleted this category , Category in use!  ");

            } else {
                categoryService.delete(category);
                redirectAttributes.addFlashAttribute("successMessage", "Category deleted  Successfully ");
            }

        } catch (RuntimeException ex) {
            redirectAttributes.addFlashAttribute("errorMessage", "You can not deleted this category , Error  Occurred  ");

        }
        return "redirect:/category/list";

    }

}
