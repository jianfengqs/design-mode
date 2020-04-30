package com.qs.mode.factory.factorymethod.pizzastore.order;

import com.qs.mode.factory.factorymethod.pizzastore.pizza.*;

/**
 * @Desc: 伦敦订购披萨
 * @author: jianfeng
 * @Time: 2020/4/29 15:14
 * @Copyright:
 * @Warning:
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(type)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
