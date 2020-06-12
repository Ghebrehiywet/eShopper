package edu.miu.cs.cs425.eshopping.controller;

import edu.miu.cs.cs425.eshopping.model.Buyer;
import edu.miu.cs.cs425.eshopping.model.Role;
import edu.miu.cs.cs425.eshopping.model.ValidationGroups;
import edu.miu.cs.cs425.eshopping.service.BuyerService;
import edu.miu.cs.cs425.eshopping.service.RoleService;
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

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/buyer")
public class BuyerController {

    private BuyerService buyerService;
    private UserService userService;
    private RoleService roleService;

    @Autowired
    public BuyerController(BuyerService buyerService, UserService userService, RoleService roleService) {
        this.buyerService = buyerService;
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping(value = "/registration")
    public String getRegistration(@ModelAttribute("buyer") Buyer buyer) {
        return "buyer/buyerRegistrationForm";
    }

    @PostMapping(value = "/registration")
    @Validated(ValidationGroups.CreateValidation.class)
    public String saveBuyer(@Valid @ModelAttribute("buyer") Buyer buyer, BindingResult result, Model model,
                            RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "buyer/buyerRegistrationForm";
        }
        Role role = roleService.findByRoleName("BUYER");
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        buyer.getUser().setUsername(buyer.getEmail());
        buyer.getUser().setActive(1);
        buyer.getUser().setRoles(roles);
        userService.save(buyer.getUser());
        Buyer buyerResult = buyerService.save(buyer);
        System.out.println("*****************" + buyer);
        redirectAttributes.addFlashAttribute("firstName", buyer.getFirstName());
        return "redirect:/login";
    }

    @GetMapping(value = "/update")
    public String getUpdate(String email, Model model) {
        Buyer buyer = buyerService.findByEmail("buyer@gmail.com");
        model.addAttribute("buyer", buyer);

        return "buyer/buyerUpdateForm";
    }

    @PostMapping(value = "/update")
    @Validated(ValidationGroups.UpdateValidation.class)
    public String saveUpdate(@Valid @ModelAttribute("buyer") Buyer buyer, BindingResult result, Model model,
                             RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "buyer/buyerUpdateForm";
        }
        Buyer existing = buyerService.find(buyer.getId());
        //buyer.setUser(existing.getUser());
        existing.setFirstName(buyer.getFirstName());
        existing.setLastName(buyer.getLastName());
        existing.setEmail(buyer.getEmail());
        existing.getUser().setPassword(buyer.getUser().getPassword());

//        Role role = roleService.findByRoleName("BUYER");
//        Set<Role> roles = new HashSet<>();
//        roles.add(role);
//
//        buyer.getUser().setUsername(buyer.getEmail());
//        buyer.getUser().setActive(1);
//        buyer.getUser().setRoles(roles);

        userService.save(existing.getUser());
        Buyer buyerResult = buyerService.save(existing);
//        System.out.println("*****************" + existing);
        redirectAttributes.addFlashAttribute("firstName", existing.getFirstName());
        return "redirect:/login";
    }


}
