/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.foody.controllers;

import java.util.Map;
import com.foody.pojo.Cart;
import com.foody.utils.Utils;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Admin
 */
@Controller
public class CartController {
    @GetMapping("/cart")
    public String cart(Model model, HttpSession session){
        Map<Integer, Cart> cart = (Map<Integer, Cart>) session.getAttribute("cart");
        if(cart != null)
            model.addAttribute("carts", cart.values());
        else
            model.addAttribute("carts", null);
        
        model.addAttribute("cartStats", Utils.cartStats(cart));
        
        return "cart";
    }
}
