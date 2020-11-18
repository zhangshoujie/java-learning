package com.sjzhang.sm.dao;

import com.sjzhang.sm.entity.Department;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentDao
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/17
 **/
public interface DepartmentDao {
    /**
     * 查询所有院系
     * @return
     * @throws SQLException
     */
    List<Department> getAll() throws SQLException;
}
