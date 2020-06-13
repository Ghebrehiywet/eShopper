package edu.miu.cs.cs425.eshopping.controller;

import edu.miu.cs.cs425.eshopping.model.CartItem;
import edu.miu.cs.cs425.eshopping.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;

@Controller
public class CartItemController {

    @Autowired
    CartItemService cartItemService;

    @GetMapping("/eshopper/cartlist")
    public String getCart(Model model) {
        model.addAttribute("cart",cartItemService.getCartItem());
        return "login";
    }


    public String addCart(@Valid @ModelAttribute CartItem cartItem, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("errors",bindingResult.getAllErrors());
            return "";
        }
        CartItem cartItem1=cartItemService.saveCartItem(cartItem);
        return "";
    }



    public String updateCart(@Valid @ModelAttribute CartItem cartItem, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "";
        }
        CartItem cart=cartItemService.saveCartItem(cartItem);
        return "";
    }




    public String deleteCart(@PathVariable Long id){
        cartItemService.deleteCart(id);
        return "";
    }
}
