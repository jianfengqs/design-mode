package com.qs.mode.singleton.type6;

/**
 * @Desc: 单例模式：双从检查（Double-Check）
 * @author: jianfeng
 * @Time: 2020/4/29 10:30
 * @Copyright:
 * @Warning:
 */
public class SingletonTest06 {

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
 * 双从检查（Double-Check）
 */
class Singleton {

    /**
     * volatile关键字修饰局部变量，保证内存可见性
     */
    private static volatile Singleton INSTANCE;

    private Singleton() {

    }

    /**
     * 提供一个静态的共有方法，当使用到该方法时，才去创建instance
     * 用synchronized关键字修饰同步代码块
     */
    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                INSTANCE = new Singleton();
            }
        }
        return INSTANCE;
    }

}
