package com.sjzhang.sm.service;

import com.sjzhang.sm.entity.Department;
import com.sjzhang.sm.factory.ServiceFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DepartmentServiceTest {
    private final DepartmentService departmentService = ServiceFactory.getDepartmentServiceInstance();
    @Test
    public void selectAll() {
        List<Department> departmentList = departmentService.selectAll();
        departmentList.forEach(System.out::print);
    }
}