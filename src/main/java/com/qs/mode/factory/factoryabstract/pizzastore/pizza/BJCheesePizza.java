package com.qs.mode.factory.factoryabstract.pizzastore.pizza;

/**
 * @Desc: 北京奶酪披萨
 * @author: jianfeng
 * @Time: 2020/4/30 9:58
 * @Copyright:
 * @Warning:
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的奶酪披萨");
        System.out.println(" 北京的奶酪披萨，准备原材料");
    }
}
