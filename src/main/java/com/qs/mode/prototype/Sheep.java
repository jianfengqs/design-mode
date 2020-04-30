package com.qs.mode.prototype;

/**
 * @Desc:   原型对象
 * @author: jianfeng
 * @Time: 2020/4/30 17:03
 * @Copyright:
 * @Warning:
 */
public class Sheep {

    private String name;
    private int age;
    private String color;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Sheep{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
