package com.sjzhang.java.unit4.chapter4;

/**
 * @ClassName Rect
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/11
 **/
public class Rect {
    double width,height,area;
    void setWidth(double width){
        if (width > 0){
            this.width = width;
        }
    }
    void setHeight(double height){
        if (height > 0){
            this.height = height;
        }
    }
    double getWidth(){
        return  width;
    }
    double getHeight(){
        return  height;
    }
    double getArea(){
        area = height * width;
        return area;
    }

}
