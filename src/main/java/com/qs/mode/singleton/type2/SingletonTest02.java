package com.qs.mode.singleton.type2;

/**
 * @Desc: 单例模式：饿汉式（静态代码块）
 * @author: jianfeng
 * @Time: 2020/4/29 9:56
 * @Copyright:
 * @Warning:
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        // 测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

    }

}

/**
 * 饿汉式（静态代码块）
 */
class Singleton {

    /**
     * 1、构造器私有化,外部不能new
     */
    private Singleton() {

    }

    /**
     * 2、声明局部变量
     */
    private static Singleton INSTANCE;

    /**
     * 3、在静态代码块中，创建单例对象
     */
    static {
        INSTANCE = new Singleton();
    }

    /**
     * 4、提供一个公有的静态方法，返回实例对象
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }

}