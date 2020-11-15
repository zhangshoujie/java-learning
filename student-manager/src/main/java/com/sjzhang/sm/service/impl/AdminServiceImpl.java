package com.sjzhang.sm.service.impl;

import com.sjzhang.sm.dao.AdminDao;
import com.sjzhang.sm.factory.DaoFactory;
import com.sjzhang.sm.service.AdminService;
import com.sjzhang.sm.utils.ResultEntity;

import java.sql.ResultSet;

/**
 * @ClassName AdminServiceLmpl
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/14
 **/
public class AdminServiceLmpl  implements AdminService {
    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();

    public ResultEntity adminLogin()
}
