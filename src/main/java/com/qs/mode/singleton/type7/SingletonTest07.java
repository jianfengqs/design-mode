package com.qs.mode.singleton.type7;

/**
 * @Desc: 单例模式：静态内部类
 * @author: jianfeng
 * @Time: 2020/4/29 10:30
 * @Copyright:
 * @Warning:
 */
public class SingletonTest07 {

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
 * 静态内部类，推荐使用
 */
class Singleton {

    /**
     * 构造器私有化
     */
    private Singleton() {
    }

    /**
     * 写一个静态内部类，该类中有一个静态属性Singleton
     */
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 提供一个静态的共有方法，直接返回SingletonInstance.INSTANCE
     */
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
