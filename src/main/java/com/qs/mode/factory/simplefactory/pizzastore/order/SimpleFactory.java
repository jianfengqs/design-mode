package com.qs.mode.factory.simplefactory.pizzastore.order;

import com.qs.mode.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.qs.mode.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.qs.mode.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.qs.mode.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @Desc: 简单工厂
 * @author: jianfeng
 * @Time: 2020/4/29 15:46
 * @Copyright:
 * @Warning:
 */
public class SimpleFactory {

    /**
     * 根据type，返回对应的Pizza对象
     */
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨");
        } else if ("cheese".equals(type)) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨");
        } else if ("pepper".equals(type)) {
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨");
        }
        return pizza;
    }

}
