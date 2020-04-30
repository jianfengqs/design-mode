package com.qs.mode.factory.factoryabstract.pizzastore.order;

import com.qs.mode.factory.factoryabstract.pizzastore.pizza.Pizza;

/**
 * @Desc: 抽象层接口
 * @author: jianfeng
 * @Time: 2020/4/30 11:09
 * @Copyright:
 * @Warning:
 */
public interface AbstractFactory {

    /**
     * 创建披萨的接口
     */
    Pizza createPizza(String type);

}
