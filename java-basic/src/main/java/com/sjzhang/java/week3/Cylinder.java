package com.sjzhang.java.week3;

/**
 * @ClassName Cylinder
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/19
 **/
public class Cylinder extends Circle {
    private int h;

    public Cylinder(int x, int y, int r, int h){
        super(x, y, r);
        this.h = h;
    }

    @Override
    public void print(){
        //super.print();
        System.out.println("圆锥的体积：" + super.getArea() * h);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
