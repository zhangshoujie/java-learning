package com.sjzhang.java.unit4.chapter22.data.two;
import com.sjzhang.java.unit4.chapter22.data.one.Circle;
public class Circular {
    Circle bottom;
    double height;
    public Circular(Circle c,double h){
        bottom = c;
        height = h;
    }
    public double getVolme(){
        return bottom.getArea() * height / 3;
    }
}
