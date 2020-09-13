package com.designpatterns.demo.SingletonPattern;

/**
 * @Project : DesignPatterns
 * @Package Name : com.designpatterns.demo.SingletonPattern
 * @Company home
 * @Author wangxiaorui
 * @Creation Date： 2020/9/13 18:07
 * @Description : 单例模式01（饿汉模式，优点线程安全，缺点类加载的时候直接加载，不管你用不用）
 */
public class mode01 {
    private static final mode01 instance = new mode01();

    private mode01(){}

    public static mode01 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        mode01 instance01 = getInstance();
        mode01 instance02 = getInstance();
        System.out.println(instance01 == instance02);
    }
}
