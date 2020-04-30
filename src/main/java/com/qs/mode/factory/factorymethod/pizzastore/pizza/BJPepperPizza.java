package com.qs.mode.factory.factorymethod.pizzastore.pizza;

/**
 * @Desc: 北京胡椒披萨
 * @author: jianfeng
 * @Time: 2020/4/30 9:58
 * @Copyright:
 * @Warning:
 */
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的胡椒披萨");
        System.out.println(" 北京的胡椒披萨，准备原材料");
    }
}
