package com.sjzhang.java.unit4.chapter17;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/12
 **/
public class Student {
    private int age;
    public void setAge(int age){
        if (age >=7&&age <= 28){
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
}
