package com.sjzhang.java.week3;

import lombok.*;

/**
 * @ClassName Point
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/19
 **/
public class Point {
    private Integer x;
    private Integer y;

    public Point(){

    }

    public Point( int x,int y) {
        this.x = x;
        this.y = y;
        System.out.println("带参数的点被初始化");
    }

    public void print(){
        System.out.println("横坐标：" + this.x + "，纵坐标："+ this.y);
    }
}
