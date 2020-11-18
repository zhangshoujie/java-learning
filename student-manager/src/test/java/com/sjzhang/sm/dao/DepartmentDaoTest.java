package com.sjzhang.sm.dao;

import com.sjzhang.sm.entity.Department;
import com.sjzhang.sm.factory.DaoFactory;
import org.junit.Test;

import javax.management.openmbean.CompositeDataSupport;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class DepartmentDaoTest {
    private final DepartmentDao departmentDao = DaoFactory.getDepartmentDaoInstance();
    @Test
    public void getAll() {
        List<Department> departmentList = null;
        try {

            departmentList = departmentDao.getAll();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        assert departmentList != null;
        departmentList.forEach(System.out::println);
    }
}