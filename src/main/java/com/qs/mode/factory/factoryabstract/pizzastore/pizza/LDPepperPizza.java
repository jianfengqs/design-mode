package com.qs.mode.factory.factoryabstract.pizzastore.pizza;

/**
 * @Desc: 伦敦胡椒披萨
 * @author: jianfeng
 * @Time: 2020/4/30 9:58
 * @Copyright:
 * @Warning:
 */
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的胡椒披萨");
        System.out.println(" 伦敦的胡椒披萨，准备原材料");
    }
}
