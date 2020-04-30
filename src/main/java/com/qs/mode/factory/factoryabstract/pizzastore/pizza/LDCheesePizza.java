package com.qs.mode.factory.factoryabstract.pizzastore.pizza;

/**
 * @Desc: 伦敦奶酪披萨
 * @author: jianfeng
 * @Time: 2020/4/30 9:58
 * @Copyright:
 * @Warning:
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的奶酪披萨");
        System.out.println(" 伦敦的奶酪披萨，准备原材料");
    }
}
