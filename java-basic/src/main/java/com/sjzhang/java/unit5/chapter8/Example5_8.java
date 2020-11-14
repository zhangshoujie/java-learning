package com.sjzhang.java.unit5.chapter8;

/**
 * @ClassName Example
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/18
 **/
class A{
    final double PI = 3.1415926;
    public double getArea(final double r) {
        return PI * r * r;
    }
    public final void speak(){
        System.out.println("您好，How's everthing here?");
    }
}
class B extends A {
    /*非法，不能重写speak方法
    public void speak() {
        System.out.println("您好");
    }
    */
}
public class Example5_8 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("面积： " + b.getArea(100));
        b.speak();
    }
}
