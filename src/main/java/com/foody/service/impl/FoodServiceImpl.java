/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.foody.service.impl;

import com.foody.pojo.Food;
import com.foody.repository.FoodRepository;
import com.foody.service.FoodService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
/**
 *
 * @author Admin
 */
@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodRepository foodRepository;

    @Override
    public List<Food> getFoods(Map<String, String> params, int page) {
        return this.foodRepository.getFoods(params, page);
    }

    @Override
    public int countFood() {
        return this.foodRepository.countFood();
    }
    
    @Override
    public Food getFoodById(int i) {
        return this.foodRepository.getFoodById(i);
    }
}
