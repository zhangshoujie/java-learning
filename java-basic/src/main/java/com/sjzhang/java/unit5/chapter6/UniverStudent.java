package com.sjzhang.java.unit5.chapter6;

/**
 * @ClassName UniverStudent
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/17
 **/
public class UniverStudent extends Student {
    boolean isMarriage;
    UniverStudent(int number, String name, boolean b){
        super(number, name);
    }
    public boolean getIsMarriage(){
        return isMarriage;
    }
}
