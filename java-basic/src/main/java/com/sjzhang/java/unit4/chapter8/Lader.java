package com.sjzhang.java.unit4.chapter8;

/**
 * @ClassName Lader
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/11
 **/
public class Lader {
    double 上底,高;
    static double 下底;
    void 设置上底(double a){
        上底 = a;
    }
    void 获取下底(double b){
        下底 = b;
    }
    double 获取上底(){
        return 上底;
    }
    double 获取下底(){
        return 下底;
    }
}
