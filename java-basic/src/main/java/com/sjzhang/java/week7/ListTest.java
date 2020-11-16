package com.sjzhang.java.week7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListTest
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/16
 **/
public class ListTest {
    public static void main(String[] args) {
        //创建一个List接口的实现类对象，泛型为String
        List<String> list = new ArrayList<> ();
        //增加三个元素
        list.add("Java");
        list.add("JavaScript");
        list.add("Java");
        //随机取出list中的某个元素

        //用for循环遍历list
        System.out.println("用for循环遍历list");
        for (String s : list) {
            System.out.println(s);
        }
        //用Iterator迭代器遍历list
        System.out.println("用Iterator迭代器遍历list");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ",");
        }
        //用lambda表达式遍历list
        System.out.println("用lambda表达式遍历list");
        list.forEach(s -> System.out.println(s));

        System.out.println("用lambda表达式遍历list");
        list.forEach(System.out::println);

    }
}
