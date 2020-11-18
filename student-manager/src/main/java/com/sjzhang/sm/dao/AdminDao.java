package com.sjzhang.sm.dao;

import com.sjzhang.sm.entity.Admin;

import java.sql.SQLException;

/**
 * @ClassName AdminDao
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/14
 **/
public interface AdminDao {
    /**
     * 根据账号查找管理员
     *
     * @param account:账号入参
     * @param Admin:管理员信息
     * @throws SQLException 该方法会抛出SQL异常
     */
    Admin findAdminByAccount(String account) throws SQLException;
}
