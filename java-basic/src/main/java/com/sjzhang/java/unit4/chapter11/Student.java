package com.sjzhang.java.unit4.chapter11;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/11
 **/
public class Student {
    int number;
    Student(int n){
        number = n;
    }
    void speak(){
        System.out.println("Student类的包名是com.soft2036.unit4.chapter11,我的学号：" + number);
    }
}
