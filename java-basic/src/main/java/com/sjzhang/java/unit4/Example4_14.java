package com.sjzhang.java.unit4;

/**
 * @ClassName Example4_14
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/10
 **/
public class Example4_14 {
    public static void main(String[] args) {
        Triangle tri = new Triangle(12,-3,100);
        tri.计算面积();
        tri.修改三边(3,4,5);
        tri.计算面积();
    }
}
