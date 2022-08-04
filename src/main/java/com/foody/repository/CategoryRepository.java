/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.foody.repository;



import com.foody.pojo.Category;
import java.util.List;
/**
 *
 * @author Admin
 */
public interface CategoryRepository {
     List<Category> getCategories();
     Category getCategoryById(int cateId);
}
