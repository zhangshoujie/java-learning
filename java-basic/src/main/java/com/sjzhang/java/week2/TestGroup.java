package com.sjzhang.java.week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName TestGroup
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/12
 **/
public class TestGroup {
    public static void main(String[] args) {
        Book book1 = new Book("Java基础",59,new Date());
        Book book2 = new Book("JavaScript",79,new Date());
        Book book3 = new Book("Java从入门到精通",99,new Date());
        Book book4 = new Book("Java大神养成记",299,new Date());
        Book book5 = new Book("Java宝典",199,new Date());

        Phone phone1 = new Phone("iPhone8",6666);
        Phone phone2 = new Phone("iPhone5",3333);
        Phone phone3 = new Phone("iPhone7",5555);

        Student student1 = new Student("1101","张三","男",phone1,new Book[]{book1,book2});
        Student student2 = new Student("1102","李四","女",phone2,new Book[] {book2,book3,book4});
        Student student3 = new Student("1103","hero","女",phone3,new Book[] {book5});

        Group group1 = new Group("第一组",new Student[]{student1,student3});
        Group group2 = new Group("第二组",new Student[] {student2});

        Student[] students = group1.getStudents();
        for (Student student : students) {
            System.out.println(student.getStudentName());

        }




    }
}
