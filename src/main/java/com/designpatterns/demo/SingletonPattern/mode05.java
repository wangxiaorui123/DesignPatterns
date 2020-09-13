package com.designpatterns.demo.SingletonPattern;

/**
 * @Project : DesignPatterns
 * @Package Name : com.designpatterns.demo.SingletonPattern
 * @Company home
 * @Author wangxiaorui
 * @Creation Date： 2020/9/13 18:53
 * @Description : 懒加载（解决了mode04的线程不安全的问题）双重判断，得到锁后再次判断是否new了实例，前一个判断也是有必要的，减少了后续get的验锁时间！完美答案之一
 */
public class mode05 {
    private static mode05 instance;

    private mode05(){}

    public static mode05 getInstance(){
        if (instance == null){
            synchronized (mode05.class){
                if (instance == null){
                    try {
                        Thread.sleep(1);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    instance = new mode05();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(mode05.getInstance().hashCode())).start();
        }
    }
}
