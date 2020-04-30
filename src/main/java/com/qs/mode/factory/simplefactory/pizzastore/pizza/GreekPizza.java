package com.qs.mode.factory.simplefactory.pizzastore.pizza;

/**
 * @Desc:
 * @author: jianfeng
 * @Time: 2020/4/29 15:11
 * @Copyright:
 * @Warning:
 */
public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨，准备原材料");
    }
}
