package com.foody.pojo;

import com.foody.pojo.FollowRating;
import com.foody.pojo.FoodStore;
import com.foody.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-03T14:04:19")
@StaticMetamodel(Store.class)
public class Store_ { 

    public static volatile SingularAttribute<Store, String> image;
    public static volatile SingularAttribute<Store, String> address;
    public static volatile CollectionAttribute<Store, FoodStore> foodStoreCollection;
    public static volatile SingularAttribute<Store, String> name;
    public static volatile SingularAttribute<Store, Integer> id;
    public static volatile SingularAttribute<Store, User> userId;
    public static volatile CollectionAttribute<Store, FollowRating> followRatingCollection;

}