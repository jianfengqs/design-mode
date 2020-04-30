package com.qs.mode.singleton.type8;

/**
 * @Desc: 单例模式：枚举
 * @author: jianfeng
 * @Time: 2020/4/29 10:30
 * @Copyright:
 * @Warning:
 */
public class SingletonTest08 {

    public static void main(String[] args) {
        // 测试
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

        instance1.sayOk();
    }

}

/**
 * 枚举
 */
enum Singleton {

    INSTANCE;

    public void sayOk() {
        System.out.println("ok~~");
    }


}
