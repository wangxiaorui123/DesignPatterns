package com.designpatterns.demo.SingletonPattern;

/**
 * @Project : DesignPatterns
 * @Package Name : com.designpatterns.demo.SingletonPattern
 * @Company home
 * @Author wangxiaorui
 * @Creation Date： 2020/9/13 19:03
 * @Description : 通过枚举的方式实例，既线程安全，还可以防止反序列化
 */
public enum mode07 {
    instance;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(mode07.instance.hashCode())).start();
        }
    }
}
