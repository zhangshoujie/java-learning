package com.sjzhang.java.unit5.chapter6;

/**
 * @ClassName Example5_6
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/17
 **/
public class Example5_6 {
    public static void main(String[] args) {
        UniverStudent zhang = new UniverStudent(20111,"张三",false);
        int number = zhang.getNumber();
        String name = zhang.getName();
        boolean marriage = zhang.getIsMarriage();
        System.out.println(name + "的学号是：" + number);
        if (marriage == true) {
            System.out.println(name + "已婚");
        }
        else {
            System.out.println(name + "未婚");
        }
    }
}
