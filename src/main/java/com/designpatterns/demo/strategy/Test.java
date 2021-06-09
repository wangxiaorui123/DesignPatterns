package com.designpatterns.demo.strategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Project : demo
 * @Package Name : com.designpatterns.demo.strategy
 * @Company 杭州品茗信息技术有限公司
 * @Author wangxiaorui
 * @Creation Date： 2020-09-17 14:39
 * @Description : 用于测试是否正确
 */
public class Test {

    public static void main(String[] args) {
        //初始化数组
        Cat[] a = {new Cat(1,1), new Cat(4,4), new Cat(8,8), new Cat(5,5), new Cat(3,3), new Cat(10,10)};
        //初始化数组
        Dog[] d = {new Dog(1), new Dog(4), new Dog(8), new Dog(5), new Dog(3), new Dog(10)};
        //排序
        Sort.sort(a);
        Sort.sort(d);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
