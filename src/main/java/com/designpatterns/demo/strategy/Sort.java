package com.designpatterns.demo.strategy;

/**
 * @Project : demo
 * @Package Name : com.designpatterns.demo.strategy
 * @Company 杭州品茗信息技术有限公司
 * @Author wangxiaorui
 * @Creation Date： 2020-09-17 14:42
 * @Description : 底层实现排序的封装类
 */
public class Sort {

    public static Comparable[] sort(Comparable[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                index = arr[j].compareTo(arr[index]) < 0 ? j : index;
            }
            exchange(arr, i, index);
        }
        return arr;
    }

    private static void exchange(Comparable[] arr, int i, int index) {
        Comparable temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
