package com.foody.pojo;

import com.foody.pojo.Food;
import com.foody.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-03T14:04:19")
@StaticMetamodel(CommentRating.class)
public class CommentRating_ { 

    public static volatile SingularAttribute<CommentRating, Food> foodId;
    public static volatile SingularAttribute<CommentRating, Integer> id;
    public static volatile SingularAttribute<CommentRating, Integer> value;
    public static volatile SingularAttribute<CommentRating, User> userId;
    public static volatile SingularAttribute<CommentRating, String> content;

}