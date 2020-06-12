package edu.miu.cs.cs425.eshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/index", "/home", "/welcome"})
    public String root(Model model) {
        model.addAttribute("firstName", "Group 3 project");
        return "home";
    }

}
