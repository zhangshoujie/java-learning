package com.sjzhang.java.week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName StudentMapListTest
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/16
 **/
public class StudentMapListTest {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<Student>();
        List<Student> list2 = new ArrayList<Student> ();
        list1.add(new Student("Alen",20));
        list1.add(new Student("Jack",21));
        list2.add(new Student("Alice",19));
        list2.add(new Student("Mary",22));
        Map<String, List<Student>> map = new HashMap<>();
        map.put("男生", list1);
        map.put("女生", list2);
        System.out.println("***************************");
        for (Map.Entry<String, List<Student> > entry : map.entrySet()) {
            System.out.println(entry.getKey());
            List<Student> list = entry.getValue();
            //Lambda遍历内层循环
            list.forEach(stu -> {
                System.out.println(stu.getName() + "\t" + stu.getAge());
                System.out.println();
            });
        }
    }
}
