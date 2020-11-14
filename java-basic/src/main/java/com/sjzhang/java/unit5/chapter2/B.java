package com.sjzhang.java.unit5.chapter2;

/**
 * @ClassName B
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/13
 **/
public class B extends A {
    double y=12;
    public void setY(int y)
    {   //this.y=y+x; 非法，子类没有继承x
    }
    public double getY() {
        return y;
    }
}
