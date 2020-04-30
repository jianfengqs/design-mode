package com.qs.mode.prototype.improve;

/**
 * @Desc:  客户端（测试）
 * @author: jianfeng
 * @Time: 2020/4/30 17:09
 * @Copyright:
 * @Warning:
 */
public class Client {

    public static void main(String[] args) {

        Sheep sheep1=new Sheep("tom",1,"白色");
        Sheep sheep2= (Sheep) sheep1.clone();

        System.out.println("sheep1 ="+sheep1);
        System.out.println("sheep2 ="+sheep2);

    }

}
