package com.foody.pojo;

import com.foody.pojo.SaleOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-03T14:04:19")
@StaticMetamodel(Payments.class)
public class Payments_ { 

    public static volatile CollectionAttribute<Payments, SaleOrder> saleOrderCollection;
    public static volatile SingularAttribute<Payments, String> name;
    public static volatile SingularAttribute<Payments, Integer> id;

}