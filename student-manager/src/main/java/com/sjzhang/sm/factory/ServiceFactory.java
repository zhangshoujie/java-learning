package com.sjzhang.sm.factory;

import com.sjzhang.sm.dao.StudentDao;
import com.sjzhang.sm.service.AdminService;
import com.sjzhang.sm.service.ClazzService;
import com.sjzhang.sm.service.DepartmentService;
import com.sjzhang.sm.service.StudentService;
import com.sjzhang.sm.service.impl.AdminServiceImpl;
import com.sjzhang.sm.service.impl.ClazzServiceImpl;
import com.sjzhang.sm.service.impl.DepartmentServiceImpl;
import com.sjzhang.sm.service.impl.StudentServiceImpl;

/**
 * @ClassName ServiceFactory
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/14
 **/
public class ServiceFactory {
    public static AdminService getAdminServiceInstance() {

        return new AdminServiceImpl();
    }

    public static DepartmentService getDepartmentServiceInstance() {
        return new DepartmentServiceImpl();
    }


    public static ClazzService getClazzServiceInstance() {
        return new ClazzServiceImpl();
    }
    public static StudentService getStudentServiceInstance() {
        return new StudentServiceImpl();
    }
}
