package com.sjzhang.java.unit3;

/**
 * @ClassName FactorExample
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/9
 **/
public class FactorExample {
    public static void main(String[] args) {
        int a = 9,b = 5,c = 7,t = 0;
        if (b < a){
            t = a;
            a = b;
            b = t;
        }
        if (c < a){
            t = a;
            a = c;
            c = t;
        }
        if (c < b){
            t = c;
            c = b;
            b = t;
        }
        System.out.println("a=" + a + ",b=" + b + ",c=" + c);
    }
}
