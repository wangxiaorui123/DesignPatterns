package com.designpatterns.demo.strategy;

/**
 * @Project : demo
 * @Package Name : com.designpatterns.demo.strategy
 * @Company 杭州品茗信息技术有限公司
 * @Author wangxiaorui
 * @Creation Date： 2020-09-17 14:40
 * @Description : 测试类
 */
public class Cat implements Comparable<Cat>{
    private int width;

    private int height;

    @Override
    public int compareTo(Cat cat) {
        if (this.getHeight() > cat.getHeight()){
            return 1;
        } else if (this.getHeight() < cat.getHeight()){
            return -1;
        } else {
            return 0;
        }
    }

    public Cat(int width, int height){
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "cat{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
