package com.sjzhang.java.unit5.chapter9;

/**
 * @ClassName People
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/18
 **/
public class People extends Anthropoid{
    char m = 'A';
    int n = 60;
    void computer(int a, int b){
        int c = a + b;
        System.out.println(a + "加" + b + "等于" + c);
    }
    void crySpeak(String s){
        System.out.println(m + "**" + s + "**" + m);
    }
}
