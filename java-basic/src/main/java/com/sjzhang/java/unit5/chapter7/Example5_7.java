package com.sjzhang.java.unit5.chapter7;

/**
 * @ClassName Example5_7
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/17
 **/
public class Example5_7 {
    public static void main(String[] args) {
        Average aver = new Average();
        aver.n = 100.5678;
        double result1 = aver.f();
        double result2 = aver.g();
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
