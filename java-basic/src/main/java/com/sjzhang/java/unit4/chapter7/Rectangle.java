package com.sjzhang.java.unit4.chapter7;

/**
 * @ClassName Rectangle
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/11
 **/
public class Rectangle {
    double x,y,width,height;
    public void setX(double a){
        x = a;
    }
    public double getX(){
        return x;
    }
    public void  setY(double b){
        y = b;
    }
    public double getY(){
        return y;
    }
    public void setWidth(double w){
        if(width > 0)
            width = w;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double h){
        if (height > 0)
            height = h;
    }
    public double getHeight(){
        return height;
    }
}
