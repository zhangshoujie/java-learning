package com.sjzhang.java.unit2;

/**
 * @ClassName EnumerationExample
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/7
 **/
public class EnumerationExample {
    public static void main(String[] args) {
        Weekday x = Weekday.星期日;
        if(x == Weekday.星期日){
            System.out.println(x);
            System.out.println("今天我休息");
        }

    }
}
