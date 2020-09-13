package com.designpatterns.demo.SingletonPattern;

/**
 * @Project : DesignPatterns
 * @Package Name : com.designpatterns.demo.SingletonPattern
 * @Company home
 * @Author wangxiaorui
 * @Creation Date： 2020/9/13 18:45
 * @Description : 懒加载（线程安全的，但是加锁验锁耗费时间）
 */
public class mode03 {
    private static mode03 instance;

    private mode03(){}

    public static synchronized mode03 getInstance(){
        if (instance == null){
            try {
                Thread.sleep(1);
            } catch (Exception e){
                e.printStackTrace();
            }
            instance = new mode03();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(mode03.getInstance().hashCode())).start();
        }
    }
}
