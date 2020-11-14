package com.sjzhang.java.unit4.chapter5;

/**
 * @ClassName Circular
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/11
 **/
public class Circular {
    Circle bottom;
    double height;
    //构造方法，将Circle类的实例的引用传递给bottom
    Circular(Circle c,double h){
        bottom = c;
        height = h;
    }
    double getVolme(){
        return bottom.getArea() * height/3.0;
    }
    double getBottomRadius(){
        return  bottom.getRadius();
    }
    public void setBottomRadius(double r){
        bottom.setRadius(r);
    }
}
