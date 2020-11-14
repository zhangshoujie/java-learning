package com.sjzhang.java.unit4.chapter2;

/**
 * @ClassName Example4_2
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/10
 **/
public class Example4_2 {
    public static void main(String[] args) {     //应用程序的主类
        //声明对象
        XiyoujiRenwu zhubajie = null,sunwukong = null;
        //为对象分配内存，使用new运算符和默认的构造方法
        zhubajie = new XiyoujiRenwu();
        sunwukong = new XiyoujiRenwu();
        //对象猪八戒给自己的变量赋值
        zhubajie.name = PersonName.八戒;
        zhubajie.height = 1.83f;
        zhubajie.weight = 86f;
        zhubajie.head = "猪头";
        //对象sunwukong给自己的对象赋值
        sunwukong.name = PersonName.悟空;
        sunwukong.height = 1.66f;
        sunwukong.weight = 1000f;
        sunwukong.head = "猴头";
        System.out.println(zhubajie.name + "的身高：" + zhubajie.height);
        System.out.println(zhubajie.name + "的体重：" + zhubajie.weight);
        System.out.println(zhubajie.name + "的头：" + zhubajie.head);
        System.out.println(sunwukong.name + "的身高：" + sunwukong.height);
        System.out.println(sunwukong.name + "的体重：" + sunwukong.weight);
        System.out.println(sunwukong.name + "的头：" + sunwukong.head);
        //对象调用方法
        zhubajie.speak(zhubajie.name + "我想去媳妇");
        System.out.println(zhubajie.name + "现在的头" + zhubajie.head);
        //对象调用方法
        sunwukong.speak(sunwukong.name + "我重" + sunwukong.weight + "公斤，想骗猪八戒背我");
        System.out.println(sunwukong.name + "现在的头" + sunwukong.head);

    }
}
