package com.designpatterns.demo.SingletonPattern;

/**
 * @Project : DesignPatterns
 * @Package Name : com.designpatterns.demo.SingletonPattern
 * @Company home
 * @Author wangxiaorui
 * @Creation Date： 2020/9/13 18:37
 * @Description : 单例模式（懒加载，线程不安全）
 */
public class mode02 {
    private static mode02 instance;

    private mode02(){}

    public static mode02 getInstance(){
        if (instance == null){
            try {
                Thread.sleep(1);
            } catch (Exception e){
                e.printStackTrace();
            }
            instance = new mode02();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(mode02.getInstance().hashCode())).start();
        }
    }
}
