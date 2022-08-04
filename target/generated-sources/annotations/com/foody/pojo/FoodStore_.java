package com.foody.pojo;

import com.foody.pojo.Food;
import com.foody.pojo.Store;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-03T14:04:19")
@StaticMetamodel(FoodStore.class)
public class FoodStore_ { 

    public static volatile SingularAttribute<FoodStore, Food> foodId;
    public static volatile SingularAttribute<FoodStore, Integer> id;
    public static volatile SingularAttribute<FoodStore, Store> storeId;

}