package com.sjzhang.java.unit5.chapter6;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/17
 **/
public class Student {
    int number;
    String name;
    Student(){
    }
    Student(int number, String name){
        this.number = number;
        this.name = name;
    }
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
}
