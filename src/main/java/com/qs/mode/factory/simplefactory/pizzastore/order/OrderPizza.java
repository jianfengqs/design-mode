package com.qs.mode.factory.simplefactory.pizzastore.order;

import com.qs.mode.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Desc:
 * @author: jianfeng
 * @Time: 2020/4/29 15:14
 * @Copyright:
 * @Warning:
 */
public class OrderPizza {

    public OrderPizza() {
        do {
            String type = getType();
            Pizza pizza = SimpleFactory.createPizza(type);
            // 输出pizza信息
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购pizza失败");
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
