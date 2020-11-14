package com.sjzhang.java.week5;

import com.sjzhang.java.unit2.Sort;
import com.sun.org.apache.regexp.internal.RE;
import sun.plugin2.message.Message;

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName ExcptionTest
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/2
 **/
public class ExcptionTest {
    public static void main(String[] args) {
        //1.ArithmeticException 算数异常
//        int result = 0;
//        try {
//            result = 3 / 0;
//        }catch (ArithmeticException e) {
//            //JOptionPane.showMessageDialog(null, "除数不能为0！");
//            System.err.println("除数不能为0！" + new Date());
//            System.err.println(e.getMessage());
//            //e.printStackTrace();
//        }
//
//        System.out.println(result);

        //2.ArrayIndexOutOfBoundsException 数组索引越界异常
        /*int[] a = new int[] {1,2,3,4,5}; ;
        try {
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("数组索引越界");
            System.err.println("引起的原因：" + e.getCause());
            System.err.println("引起的详细信息：" + e.getMessage());
            System.err.println("异常对象e:" + e.toString());
        }*/
        //3. NumberFormatException 数字格式化异常
        System.out.println("请输入价格：");
        Scanner scanner = new Scanner(System.in);
        //从键盘读入一个字符串
        String priceStr = scanner.nextLine();
        //将字符串转化为整型
        try {
        int price = Integer.parseInt(priceStr);

        System.out.println("price = " + price);
        }catch (NumberFormatException e) {
            System.err.println("数字格式化异常");
            System.err.println("异常对象e： " + e.toString());
        }




    }
}
