package com.sjzhang.java.week7;

import java.util.*;

/**
 * @ClassName SetTest
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/16
 **/
public class SetTest {
    public static void main(String[] args) {
//        System.out.println("TreeSet的例子");
//        Student s1 = Student.builder().name("aaa").age(20).build();
//        Student s2 = Student.builder().name("bbb").age(19).build();
//        Student s3 = Student.builder().name("ccc").age(22).build();
//        Set<Student> stuSet = new TreeSet<>();
//        stuSet.add(s1);
//        stuSet.add(s2);
//        stuSet.add(s3);
//        System.out.println(stuSet);


        Set<String> set = new TreeSet<>();
        set.add("C");
        set.add("A");
        set.add("B");
        //System.out.println(set);
        //用for循环遍历list
        System.out.println("用for循环遍历list");
        for (String s : set) {
            System.out.println(s);
        }
        //用Iterator迭代器遍历list
        System.out.println("用Iterator迭代器遍历list");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ",");
        }
        //用lambda表达式遍历list
        System.out.println("用lambda表达式遍历list");
        set.forEach(s -> System.out.println(s));

        System.out.println("用lambda表达式遍历list");
        set.forEach(System.out::println);

        System.out.println("HashSet例子");
        Set<String> set1 = new HashSet<>();
        set1.add("C");
        set1.add("A");
        set1.add("B");
        //用for循环遍历list
        System.out.println("用for循环遍历list");
        Object[] array = set1.toArray();
        for (Object o : array) {
            System.out.println(o.toString());
        }
        //用Iterator迭代器遍历list
        System.out.println("用Iterator迭代器遍历list");
        Iterator<String> iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next() + ",");
        }
        //用lambda表达式遍历list
        System.out.println("用lambda表达式遍历list");
        set.forEach(s -> System.out.println(s));

        System.out.println("用lambda表达式遍历list");
        set.forEach(System.out::println);
    }
}
