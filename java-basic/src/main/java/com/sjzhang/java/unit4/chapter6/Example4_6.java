package com.sjzhang.java.unit4.chapter6;

/**
 * @ClassName Example4_6
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/11
 **/
public class Example4_6 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        double result = computer.getResult(1.0/3,10,20,30);
        System.out.println("10,20,30的平均数：" + result);
        result = computer.getResult(1.0/6,66,12,5,89,2,51);
        System.out.println("66,12,5,89,2,51的平均数：" + result);
    }
}
