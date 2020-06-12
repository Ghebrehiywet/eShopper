package edu.miu.cs.cs425.eshopping.controller;

import edu.miu.cs.cs425.eshopping.service.CategoryService;
import edu.miu.cs.cs425.eshopping.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/eshopping/api/Category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/list")
    public List<Category> getAllStudents(){
        return categoryService.getAllCategories();
    }

    @PostMapping(value = "/create")
    public Category createCategory(@RequestBody Category newCategory){
        return  categoryService.createCategory(newCategory);
    }

    @GetMapping(value = "/get/{id}")
    public Category findByIdCategory(@PathVariable Long id){
        return categoryService.findByIdCategory(id);
    }

    @PutMapping(value = "/update/{id}")
    public Category updateCategory(@RequestBody Category edited, @PathVariable Long id){
        return categoryService.updateCategory(edited, id);

    }

    @DeleteMapping(value = "/delete/{id}")
    public void  deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }

}