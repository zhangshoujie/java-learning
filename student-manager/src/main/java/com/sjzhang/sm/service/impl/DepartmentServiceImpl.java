package com.sjzhang.sm.service.impl;

import com.sjzhang.sm.dao.DepartmentDao;
import com.sjzhang.sm.entity.Department;
import com.sjzhang.sm.factory.DaoFactory;
import com.sjzhang.sm.service.DepartmentService;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentServiceImpl
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/17
 **/
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentDao departmentDao = DaoFactory.getDepartmentDaoInstance();

    @Override
    public List<Department> selectAll() {
        List<Department> departmentList = null;
        try {
            departmentList = departmentDao.getAll();
        }catch (SQLException e) {
            System.err.print("查询院系信息出现异常");
        }
        return departmentList;
    }
}
