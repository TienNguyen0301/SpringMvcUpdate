package com.foody.repository.impl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.foody.pojo.Category;
import com.foody.pojo.Food;
import com.foody.repository.CategoryRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Admin
 */
@Repository
@Transactional
public class CategoryRepositoryImpl implements CategoryRepository {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<Category> getCategories() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        Query q = session.createQuery("From Category");
        return q.getResultList();
        
//        Session session = this.sessionFactory.getObject().getCurrentSession();
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Category> query = builder.createQuery(Category.class);
//        Root root = query.from(Category.class);
//        query = query.select(root);
//        
//        Query q = session.createQuery(query);
//        return q.getResultList();
    } 

    @Override
    public Category getCategoryById(int cateId) {
       Session session = this.sessionFactory.getObject().getCurrentSession();
       return session.get(Category.class, cateId);
    }
}
