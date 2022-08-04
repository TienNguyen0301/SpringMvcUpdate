/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.foody.controllers;

import com.foody.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Admin
 */
@Controller
public class FoodController {
    @Autowired
    private FoodService foodService;
    
    @GetMapping("/foods/{foodId}")
    public String detail(Model model,@PathVariable(value = "foodId") int foodId){
          model.addAttribute("food", this.foodService.getFoodById(foodId));
          
        return "food-detail";
    }
}
