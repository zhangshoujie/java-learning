package com.sjzhang.java.unit4.chapter5;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/11
 **/
public class Circle {
    double radius;
    Circle(double r){
        radius = r;
    }
    double getArea(){
        return 3.14 * radius * radius;
    }
    void setRadius(double r){
        radius = r;
    }
    double getRadius(){
        return  radius;
    }
}
