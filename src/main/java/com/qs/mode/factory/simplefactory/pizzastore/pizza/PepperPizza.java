package com.qs.mode.factory.simplefactory.pizzastore.pizza;

/**
 * @Desc:
 * @author: jianfeng
 * @Time: 2020/4/29 15:52
 * @Copyright:
 * @Warning:
 */
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给呼叫披萨，准备原材料");
    }
}
