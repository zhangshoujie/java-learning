package com.sjzhang.java.unit3;

/**
 * @ClassName DoWhileExample
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/9
 **/
public class DoWhileExample {
    public static void main(String[] args) {
        double sum = 0,item = 1;
        int i = 1,n = 20;
        while (i <= n){
            sum = sum + item;
            i = i + 1;
            item = item * (1.0/i);
        }
        System.out.println("sum =" + sum);
    }
}

