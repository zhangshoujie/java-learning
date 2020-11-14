package com.sjzhang.java.unit5.chapter7;

/**
 * @ClassName Sum
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/17
 **/
public class Sum {
    int n;
    public double f(){
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
