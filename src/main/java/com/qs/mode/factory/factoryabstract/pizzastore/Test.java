package com.qs.mode.factory.factoryabstract.pizzastore;

import com.qs.mode.factory.factoryabstract.pizzastore.order.BJFactory;
import com.qs.mode.factory.factoryabstract.pizzastore.order.OrderPizza;

/**
 * @Desc:
 * @author: jianfeng
 * @Time: 2020/4/30 11:23
 * @Copyright:
 * @Warning:
 */
public class Test {

    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }

}
