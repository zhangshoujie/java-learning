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

    /**
     * 新增院系
     *
     * @param department 入参
     * @return int
     */
    int addDepartment(Department department);
}
