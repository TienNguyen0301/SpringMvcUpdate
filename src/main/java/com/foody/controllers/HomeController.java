/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.foody.controllers;

import com.foody.pojo.Cart;
import com.foody.service.CategoryService;
import com.foody.service.FoodService;
import com.foody.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.core.env.Environment;

/**
 *
 * @author Admin
 */
@Controller
@ControllerAdvice
public class HomeController {
    @Autowired
    private CategoryService categoryService;
    
    @Autowired
    private FoodService foodService;
    
    @Autowired
    private Environment env;
        
    @ModelAttribute
    public void commonAttrs(Model model, HttpSession session){
        model.addAttribute("categories", this.categoryService.getCategories());
        model.addAttribute("cartCounter", Utils.countCart((Map<Integer, Cart>) session.getAttribute("cart")));
    }
//    @Autowired
//    private CategoryService categoryService;


    
    
//    @RequestMapping("/")
//    public String index(Model model,@RequestParam(value="kw",required = false, defaultValue = "") String kw){
////            model.addAttribute("categories", this.categoryService.getCategories());
// 
//            model.addAttribute("foods", this.foodService.getFoods(kw));
//            
//
//        return "index";
//    }
        @RequestMapping("/")
        public String index(Model model,@RequestParam Map<String, String> params){
 
             int page = Integer.parseInt(params.getOrDefault("page", "1"));
            model.addAttribute("foods", this.foodService.getFoods(params, page));
            model.addAttribute("pageSize", Integer.parseInt(env.getProperty("page.size")));

        return "index";
    }
    

}
