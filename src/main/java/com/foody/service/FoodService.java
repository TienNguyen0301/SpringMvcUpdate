/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.foody.service;

import com.foody.pojo.Food;
import java.util.Map;
import java.util.List;
/**
 *
 * @author Admin
 */
public interface  FoodService {
     List<Food> getFoods(Map<String, String> params, int page);
     int countFood();
     Food getFoodById(int id);
}
