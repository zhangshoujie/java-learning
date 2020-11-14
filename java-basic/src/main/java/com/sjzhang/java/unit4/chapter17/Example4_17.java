package com.sjzhang.java.unit4.chapter17;

/**
 * @ClassName Example4_17
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/12
 **/
public class Example4_17 {
    public static void main(String[] args) {
        Student zhang = new Student();
        Student geng = new Student();
        zhang.setAge(23);
        System.out.println("zhang的年龄:" + zhang.getAge());
        geng.setAge(25);
        System.out.println("geng的年龄:" + geng.getAge());
    }
}
