package com.qs.mode.factory.factorymethod.pizzastore.order;


import com.qs.mode.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.qs.mode.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.qs.mode.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @Desc:  北京订购披萨
 * @author: jianfeng
 * @Time: 2020/4/29 15:14
 * @Copyright:
 * @Warning:
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza=null;
        if ("cheese".equals(type)){
            pizza=new BJCheesePizza();
        }else if ("pepper".equals(type)){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
