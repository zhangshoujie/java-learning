package com.sjzhang.sm.service;

import com.sjzhang.sm.factory.ServiceFactory;
import com.sjzhang.sm.utils.ResultEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminServiceTest {
    private final AdminService adminService = ServiceFactory.getAdminServiceInstance();

    @Test
    public void adminLogin() {
        ResultEntity resultEntity = adminService.adminLogin("taoranran@qq.com", "123123");
        assertEquals(0, resultEntity.getCode());
        System.out.println(resultEntity);
    }
}