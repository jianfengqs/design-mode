package com.qs.mode.factory.simplefactory.pizzastore.order;

/**
 * @Desc:
 * @author: jianfeng
 * @Time: 2020/4/29 16:02
 * @Copyright:
 * @Warning:
 */
public class PizzaStore {

    public static void main(String[] args) {

        // 使用简单工厂模式
        new OrderPizza();
        System.out.println("退出程序~~~");

    }

}
