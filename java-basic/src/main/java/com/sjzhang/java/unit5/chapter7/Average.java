package com.sjzhang.java.unit5.chapter7;

/**
 * @ClassName Average
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/17
 **/
public class Average extends Sum{
    double n;
    public double f(){
        double c;
        super.n = (int)n;
        c = super.f();
        return c + n;
    }
    public double g(){
        double c;
        c = super.f();
        return c - n;
    }
}
