package com.sjzhang.java.unit3;

/**
 * @ClassName ArrayForExample
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/9
 **/
public class ArrayForExample {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        char b[] = {'a','b','c','d'};
        for (int n = 0;n < a.length;n++){
            System.out.println(a[n]);
        }
        for (int n = 0;n < b.length;n++){
            System.out.println(b[n]);
        }
        for (int i:a){
            System.out.println(i);
        }
        for (char ch:b){
            System.out.println(ch);
        }

    }
}
