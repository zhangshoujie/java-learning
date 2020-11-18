package com.sjzhang.sm.service;

import com.sjzhang.sm.entity.Department;

import java.util.List;

/**
 * @ClassName DepartmentService
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/17
 **/
public interface DepartmentService {
    List<Department> selectAll();
}
