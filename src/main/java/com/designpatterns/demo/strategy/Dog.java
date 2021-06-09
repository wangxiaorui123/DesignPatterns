package com.designpatterns.demo.strategy;

/**
 * @Project : demo
 * @Package Name : com.designpatterns.demo.strategy
 * @Company 杭州品茗信息技术有限公司
 * @Author wangxiaorui
 * @Creation Date： 2020-09-17 15:59
 * @Description : 测试类
 */
public class Dog implements Comparable<Dog> {
    private int eatFind;

    @Override
    public int compareTo(Dog dog) {
        if (this.eatFind > dog.eatFind){
            return 1;
        } else if (this.eatFind < dog.eatFind){
            return -1;
        } else {
            return 0;
        }
    }

    public Dog(int eatFind){
        this.eatFind = eatFind;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "eatFind=" + eatFind +
                '}';
    }
}
