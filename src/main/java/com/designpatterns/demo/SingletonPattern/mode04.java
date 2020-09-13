package com.designpatterns.demo.SingletonPattern;

/**
 * @Project : DesignPatterns
 * @Package Name : com.designpatterns.demo.SingletonPattern
 * @Company home
 * @Author wangxiaorui
 * @Creation Date： 2020/9/13 18:48
 * @Description : 懒加载（修改加锁验锁地方，但是导致线程不安全）
 */
public class mode04 {
    private static mode04 instance;

    private mode04(){}

    public static mode04 getInstance(){
        if (instance == null){
            synchronized (mode04.class){
                try {
                    Thread.sleep(1);
                } catch (Exception e){
                    e.printStackTrace();
                }
                instance = new mode04();
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(mode04.getInstance().hashCode())).start();
        }
    }
}
