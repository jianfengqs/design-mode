package com.qs.mode.factory.factorymethod.pizzastore.order;


import com.qs.mode.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Desc:  抽象工厂类
 * @author: jianfeng
 * @Time: 2020/4/29 15:14
 * @Copyright:
 * @Warning:
 */
public abstract class OrderPizza {

    /**
     * 定义一个抽象方法，createPizza，让各个工厂子类自己实现
     */
    abstract Pizza createPizza(String type);

    /**
     * 构造器
     */
    public OrderPizza() {
        Pizza pizza = null;
        do {
            // 订购披萨的类型
            String type = getType();
            pizza = createPizza(type);

            // 输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }


    /**
     * 写一个方法，可以获取客户希望订购的披萨种类
     */
    private String getType() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type:");
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
        return str;
    }


}
