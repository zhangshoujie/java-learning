package com.sjzhang.sm.factory;

import com.sjzhang.sm.dao.AdminDao;
import com.sjzhang.sm.dao.ClazzDao;
import com.sjzhang.sm.dao.DepartmentDao;
import com.sjzhang.sm.dao.StudentDao;
import com.sjzhang.sm.dao.impl.AdminDaoImpl;
import com.sjzhang.sm.dao.impl.ClazzDaoImpl;
import com.sjzhang.sm.dao.impl.DepartmentDaoImpl;
import com.sjzhang.sm.dao.impl.StudentDaoImpl;
import com.sjzhang.sm.entity.Admin;
import com.sjzhang.sm.entity.Department;
import com.sjzhang.sm.entity.Student;

/**
 * @ClassName DaoFactory
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/14
 **/
public class DaoFactory {

    public static AdminDao getAdminDaoInstance() {
        return new AdminDaoImpl();
    }

    public static DepartmentDao getDepartmentDaoInstance() {
        return new DepartmentDaoImpl();
    }
    public static ClazzDao getClazzDaoInstance() {
        return new ClazzDaoImpl();
    }
    public static StudentDao getStudentDaoInstance() {
        return new StudentDaoImpl();
    }

}
