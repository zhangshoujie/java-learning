package com.sjzhang.java.unit2;

import java.util.Arrays;

/**
 * @ClassName Sort
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/8
 **/
public class Sort {
    public static void main(String[] args) {
        int []a = {12,34,9,23,45,6,46,90,123,19,34};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int number = 45;
        int index = Arrays.binarySearch(a,number);
        if (index >= 0){
            System.out.println(number + "和数组中索引为" + index + "的元素值相同");
        }
        else {
            System.out.println(number + "不与数组中的任何元素值相同");
        }
    }
}