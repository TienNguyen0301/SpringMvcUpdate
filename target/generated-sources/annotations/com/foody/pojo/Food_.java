package com.foody.pojo;

import com.foody.pojo.Category;
import com.foody.pojo.CommentRating;
import com.foody.pojo.FoodStore;
import com.foody.pojo.OrderDetail;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-03T14:04:19")
@StaticMetamodel(Food.class)
public class Food_ { 

    public static volatile SingularAttribute<Food, String> image;
    public static volatile CollectionAttribute<Food, OrderDetail> orderDetailCollection;
    public static volatile SingularAttribute<Food, BigInteger> price;
    public static volatile CollectionAttribute<Food, FoodStore> foodStoreCollection;
    public static volatile CollectionAttribute<Food, CommentRating> commentRatingCollection;
    public static volatile SingularAttribute<Food, String> name;
    public static volatile SingularAttribute<Food, Boolean> active;
    public static volatile SingularAttribute<Food, Integer> id;
    public static volatile SingularAttribute<Food, Category> categoryId;

}