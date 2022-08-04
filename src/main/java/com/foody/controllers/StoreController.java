/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.foody.controllers;

import com.foody.pojo.Store;
import com.foody.utils.Utils;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Admin
 */
@Controller
public class StoreController {
    @GetMapping("/store")
    public String store(Model model, HttpSession session){
//        Map<Integer, Store> cart = (Map<Integer, Store>) session.getAttribute("store");
//        if(cart != null)
//            model.addAttribute("stores", store.values());
//        else
//            model.addAttribute("stores", null);
//        
//        model.addAttribute("cartStats", Utils.cartStats(store));
        
        return "store";
    }
}
