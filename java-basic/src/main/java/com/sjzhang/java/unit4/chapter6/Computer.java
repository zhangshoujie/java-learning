package com.sjzhang.java.unit4.chapter6;

/**
 * @ClassName Computer
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/11
 **/
public class Computer {
    public double getResult(double a,int ... x){
        double result;
        int sum = 0;
        for (int i = 0;i < x.length;i++){
            sum = sum + x[i];
        }
        result = a * sum;
        return result;
    }
}
