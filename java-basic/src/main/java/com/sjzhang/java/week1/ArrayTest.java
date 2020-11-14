package com.sjzhang.java.week1;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName ArrayTest
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/5
 **/
public class ArrayTest {
    static int MAX = 5;

    public static void main(String[] args) {
        //创建一个10个元素的整型类型
        int[] a = new int[MAX];
        //创建随机数种子
        Random random = new Random();
        //数据原始值为
        for (int i = 0; i < MAX - 1; i++){
            //循环生成100以内随机整数赋值给数组
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
        //求最大值、最小值、和
        int max = 0;
        int min = 0;
        int sum = 0;
        max = a[0];
        min = a[0];
        for(int j= 0; j < a.length; j++){
            if (a[j] > max){
                max = a[j];
            }
            if (a[j] < min){
                min = a[j];
            }
            sum = sum + a[j];
        }
        System.out.println(" ");
        System.out.print( "最大值为： " +max + " 最小值为： " + min + " 和为： " + sum + " ");

        //排序
        System.out.println(" ");
        Arrays.sort(a);
        for(int k = 0; k < a.length; k++){
            System.out.print( a[k] + " ");
        }
    }
}
