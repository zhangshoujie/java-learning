package com.sjzhang.java.unit4.chapter22;

import com.sjzhang.java.unit4.chapter21.sohu.com.TestOne;
import com.sjzhang.java.unit4.chapter22.data.one.Circle;
import com.sjzhang.java.unit4.chapter22.data.two.Circular;

public class Example4_22 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Circular circular = new Circular(circle,20);
        System.out.println("圆锥的体积:" + circular.getVolme());
        TestOne a = new TestOne();
        a.TestOne();
    }
}
