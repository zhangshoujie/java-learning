package com.sjzhang.java.unit2;

import java.util.Scanner;

/**
 * @ClassName FigureOut
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/7
 **/
public class FigureOut {
    public static void main(String[] args) {
        System.out.println("用空格（或回车）做分隔符，输入若干个数，最后输入#结束，\n然后回车确认。");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (reader.hasNextDouble()){
            double x = reader.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值" + sum/m);
    }
}
