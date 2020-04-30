package com.qs.mode.singleton.type3;

/**
 * @Desc: 单例模式：懒汉式（线程不安全）
 * @author: jianfeng
 * @Time: 2020/4/29 10:30
 * @Copyright:
 * @Warning:
 */
public class SingletonTest03 {

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
 * 懒汉式（线程不安全）
 */
class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {

    }

    /**
     * 提供一个静态的共有方法，当使用到该方法时，才去创建instance
     */
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

}
