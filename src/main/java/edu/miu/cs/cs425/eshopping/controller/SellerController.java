package edu.miu.cs.cs425.eshopping.controller;

import edu.miu.cs.cs425.eshopping.model.Admin;
import edu.miu.cs.cs425.eshopping.model.Role;
import edu.miu.cs.cs425.eshopping.model.Seller;
import edu.miu.cs.cs425.eshopping.service.RoleService;
import edu.miu.cs.cs425.eshopping.service.SellerService;
import edu.miu.cs.cs425.eshopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashSet;
import java.util.Set;


@Controller
@RequestMapping("/seller")
public class SellerController {
    private SellerService sellerService;
    private UserService userService;
    private RoleService roleService;

    @Autowired
    public SellerController(SellerService sellerService, UserService userService, RoleService roleService) {
        this.sellerService = sellerService;
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping(value = "/registration")
    public String getRegistration(@ModelAttribute("seller") Seller seller) {
        return "seller/sellerRegistration";
    }

    @PostMapping(value = "/registration")
    public String saveSeller(@Validated @ModelAttribute("seller") Seller seller, BindingResult result, Model model,
                             RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "seller/sellerRegistration";
        }
        Role role = roleService.findByRoleName("SELLER");
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        seller.getUser().setUsername(seller.getEmail());
        seller.getUser().setActive(0);
        seller.getUser().setRoles(roles);
        userService.save(seller.getUser());
        Seller sellerResult = sellerService.addSeller(seller);
        redirectAttributes.addFlashAttribute("firstName", seller.getFullName());
        return "redirect:/login";
    }


    @GetMapping(value = "/update")
    public String getUpdate(String email, Model model) {
        Seller seller = sellerService.findByEmail("seller@gmail.com");
        model.addAttribute("seller", seller);

        return "seller/updateForm";
    }

    @PostMapping(value = "/update")
    public String updateSeller(@Validated @ModelAttribute("seller") Seller seller, BindingResult result, Model model,
                               RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "seller/updateForm";
        }

        Seller existing = sellerService.find(seller.getId());
        //buyer.setUser(existing.getUser());
        existing.setFullName(seller.getFullName());
        existing.setPhoneNumber(seller.getPhoneNumber());
        existing.setEmail(seller.getEmail());
        existing.getUser().setPassword(seller.getUser().getPassword());

        userService.save(existing.getUser());
        Seller sellerResult = sellerService.addSeller(existing);
        redirectAttributes.addFlashAttribute("firstName", existing.getFullName());
        return "redirect:/login";
    }

}