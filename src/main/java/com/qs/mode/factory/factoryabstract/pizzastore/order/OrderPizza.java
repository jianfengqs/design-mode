package com.qs.mode.factory.factoryabstract.pizzastore.order;

import com.qs.mode.factory.factoryabstract.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Desc:
 * @author: jianfeng
 * @Time: 2020/4/30 11:13
 * @Copyright:
 * @Warning:
 */
public class OrderPizza {

    AbstractFactory abstractFactory;

    public OrderPizza(AbstractFactory abstractFactory) {
        setFactory(abstractFactory);
    }

    private void setFactory(AbstractFactory factory) {
        Pizza pizza = null;
        this.abstractFactory = factory;

        do {
            String type = getType();
            // factory可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = factory.createPizza(type);
            if (pizza != null) {
                // 输出pizza制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
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
