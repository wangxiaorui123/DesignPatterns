package com.designpatterns.demo.SingletonPattern;

/**
 * @Project : DesignPatterns
 * @Package Name : com.designpatterns.demo.SingletonPattern
 * @Company home
 * @Author wangxiaorui
 * @Creation Date： 2020/9/13 18:57
 * @Description : 通过内部匿名类的方式实现懒加载单例！完美答案之二
 */
public class mode06 {
    private mode06(){}

    /**
     * 加载类时不会加载内部匿名类，所以内部匿名类的实例不会被加载
     */
    private static class mode06H{
        private static final mode06 instance = new mode06();
    }

    /**
     * 调用获取方式时在加载内部匿名类，加载内部匿名类的时候就会实例对象
     * 线程安全的问题JVM会自己控制只实例一次
     * @return
     */
    public static mode06 getInstance(){
        return mode06H.instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(mode06.getInstance().hashCode())).start();
        }
    }
}
