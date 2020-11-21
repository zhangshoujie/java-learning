package com.sjzhang.sm.dao;

import com.sjzhang.sm.entity.Clazz;
import com.sjzhang.sm.factory.DaoFactory;
import com.sjzhang.sm.factory.ServiceFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class ClazzDaoTest {
    private final ClazzDao clazzDao = DaoFactory.getClazzDaoInstance();

    @Test
    public void selectByDepartmentId() {
        List<Clazz> clazzList = null;
        try {
            clazzList = clazzDao.selectByDepartmentId(5);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(clazzList);
    }

    @Test
    public void getClazzDaoId() {
        List<Clazz> list = ServiceFactory.getClazzServiceInstance().getClazzByDepId(5);
        list.forEach(System.out::println);


    }
}