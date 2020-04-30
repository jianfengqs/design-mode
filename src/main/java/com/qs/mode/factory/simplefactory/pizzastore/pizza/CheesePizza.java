package com.qs.mode.factory.simplefactory.pizzastore.pizza;

/**
 * @Desc:
 * @author: jianfeng
 * @Time: 2020/4/29 15:08
 * @Copyright:
 * @Warning:
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨，准备原材料");
    }
}
