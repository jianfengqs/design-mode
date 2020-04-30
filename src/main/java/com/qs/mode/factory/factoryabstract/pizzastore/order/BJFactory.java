package com.qs.mode.factory.factoryabstract.pizzastore.order;

import com.qs.mode.factory.factoryabstract.pizzastore.pizza.BJCheesePizza;
import com.qs.mode.factory.factoryabstract.pizzastore.pizza.BJPepperPizza;
import com.qs.mode.factory.factoryabstract.pizzastore.pizza.Pizza;

/**
 * @Desc:  北京具体工厂类
 * @author: jianfeng
 * @Time: 2020/4/30 11:10
 * @Copyright:
 * @Warning:
 */
public class BJFactory implements AbstractFactory{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null;
        if ("cheese".equals(type)){
            pizza=new BJCheesePizza();
        }else if ("pepper".equals(type)){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
