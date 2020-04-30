package com.qs.mode.factory.simplefactory.pizzastore.pizza;

/**
 * @Desc: 披萨抽象类
 * @author: jianfeng
 * @Time: 2020/4/29 14:51
 * @Copyright:
 * @Warning:
 */
public abstract class Pizza {

    protected String name;

    /**
     * 烘烤
     */
    public void bake() {
        System.out.println(name + " baking;");
    }

    /**
     * 切割
     */
    public void box() {
        System.out.println(name + " boxing;");
    }

    /**
     * 打包
     */
    public void cut() {
        System.out.println(name + " cutting;");
    }

    /**
     * 准备原材料，不同的披萨不一样，因此，我们做成抽象方法
     */
    public abstract void prepare();

    public void setName(String name) {
        this.name = name;
    }

}
