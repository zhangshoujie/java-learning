package com.sjzhang.sm.dao;

import com.sjzhang.sm.entity.Admin;
import com.sjzhang.sm.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class AdminDaoTest {
    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();

    @Test
    public void findAdminByAccount() throws Exception {
        Admin admin;
        try {
            admin = adminDao.findAdminByAccount("taoranran@qq.com");
            assertEquals("陶然然", admin.getAdminName());
            System.out.println(admin);
        }catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}