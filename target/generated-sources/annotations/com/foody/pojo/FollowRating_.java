package com.foody.pojo;

import com.foody.pojo.Store;
import com.foody.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-03T14:04:19")
@StaticMetamodel(FollowRating.class)
public class FollowRating_ { 

    public static volatile SingularAttribute<FollowRating, Boolean> active;
    public static volatile SingularAttribute<FollowRating, Integer> id;
    public static volatile SingularAttribute<FollowRating, Store> storeId;
    public static volatile SingularAttribute<FollowRating, Integer> value;
    public static volatile SingularAttribute<FollowRating, User> userId;

}