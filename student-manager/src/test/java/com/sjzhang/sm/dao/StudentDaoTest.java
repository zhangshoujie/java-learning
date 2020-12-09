package com.sjzhang.sm.dao;

import com.sjzhang.sm.entity.Student;
import com.sjzhang.sm.factory.DaoFactory;
import com.sjzhang.sm.vo.StudentVo;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class StudentDaoTest {

    @Test
    public void selectAll() throws SQLException {
        List<StudentVo> list = DaoFactory.getStudentDaoInstance().selectAll();
        list.forEach(System.out::println);
    }

    @Test
    public void selectByDepId() throws SQLException {
        List<StudentVo> list = DaoFactory.getStudentDaoInstance().selectByDepId(5);
        list.forEach(System.out::println);
    }

    @Test
    public void selectByClassId() throws SQLException {
        List<StudentVo> list = DaoFactory.getStudentDaoInstance().selectByClassId(10);
        list.forEach(System.out::println);
    }

    @Test
    public void selectByKeywords() throws SQLException {
        List<StudentVo> list = DaoFactory.getStudentDaoInstance().selectByKeywords("张");
        list.forEach(System.out::println);
    }

    @Test
    public void insert() throws SQLException {
        Student student = new Student();
        student.setId("15");
        student.setClassId(18);
        student.setStudentName("李一");
        student.setAvatar("https://zsj-bucket.oss-cn-beijing.aliyuncs.com/picture/leoo.jpg");
        student.setBirthday(new Date());
        student.setGender((short) 1);
        student.setPhone("13899991111");
        student.setAddress("四川成都");
        int n = DaoFactory.getStudentDaoInstance().insertStudent(student);
        assertEquals(1, n);
    }

}