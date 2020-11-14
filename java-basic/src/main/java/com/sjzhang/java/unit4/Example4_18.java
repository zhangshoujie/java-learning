package com.sjzhang.java.unit4;

/**
 * @ClassName Example4_18
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/10
 **/
public class Example4_18 {
    public static void main(String[] args) {
        char a[] = {'a','b','c','D','E','F'};
        for (int i = 0;i < a.length;i++){
            if (Character.isLowerCase(a[i])){
                a[i] = Character.toUpperCase(a[i]);
            }
            else if (Character.isUpperCase(a[i])){
                a[i] = Character.toLowerCase(a[i]);
            }
        }
        for (int i = 0; i < a.length;i++){
            System.out.println(" " + a[i]);
        }
    }
}
