package com.sjzhang.java.unit1;

/**
 * @ClassName Example1
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/7
 **/
class Example1{
    public static void main(String[] args) {
        Rect rectangle;
        rectangle  = new Rect();
        rectangle.width = 1.819;
        rectangle.height = 1.5;
        double area = rectangle.getArea();
        System.out.println("矩形的面积:" + area);
    }
}
class Rect {
    double width;
    double height;
    double getArea(){
        return width * height;
    }
}