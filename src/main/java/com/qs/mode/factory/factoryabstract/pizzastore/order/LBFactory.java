package com.qs.mode.factory.factoryabstract.pizzastore.order;

import com.qs.mode.factory.factoryabstract.pizzastore.pizza.*;

/**
 * @Desc:  伦敦具体工厂类
 * @author: jianfeng
 * @Time: 2020/4/30 11:10
 * @Copyright:
 * @Warning:
 */
public class LBFactory implements AbstractFactory{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null;
        if ("cheese".equals(type)){
            pizza=new LDCheesePizza();
        }else if ("pepper".equals(type)){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
