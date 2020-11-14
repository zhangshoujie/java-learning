package com.sjzhang.java.unit4.chapter7;

/**
 * @ClassName Example4_7
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/11
 **/
public class Example4_7 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();
        Geometry geometry;
        geometry = new Geometry(rect,circle);
        geometry.setRectanglePosition(30,40);
        geometry.setRectangleWidthAndHeight(120,80);
        geometry.setCirclePosition(260,30);
        geometry.setCircleRadius(60);
        System.out.println("几何图形中圆和矩形的位置关系：");
        geometry.showState();
        System.out.println("几何图形重新调整了圆和矩形的位置：");
        geometry.setRectanglePosition(220,160);
        geometry.setCirclePosition(40,30);
        System.out.println("调整后,几何图形中圆和矩形的位置关系：");
        geometry.showState();
    }
}
