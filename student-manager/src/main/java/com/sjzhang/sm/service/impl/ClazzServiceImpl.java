package com.sjzhang.sm.service.impl;

import com.sjzhang.sm.dao.ClazzDao;
import com.sjzhang.sm.entity.Clazz;
import com.sjzhang.sm.entity.Department;
import com.sjzhang.sm.factory.DaoFactory;
import com.sjzhang.sm.service.ClazzService;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName ClazzServiceImpl
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/20
 **/
public class ClazzServiceImpl implements ClazzService {
    private static final ClazzDao clazzDao = DaoFactory.getClazzDaoInstance();

    @Override
    public List<Clazz> getClazzByDepId(int department) {
        List<Clazz> clazzList = null;
        try {
            clazzList = clazzDao.selectByDepartmentId(department);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return clazzList;
    }

    @Override
    public int addClazz(Clazz clazz) {
        int n = 0;
        try {
            n = DaoFactory.getClazzDaoInstance().insertClazz(clazz);
        } catch (SQLException throwables) {
            System.err.println("新增班级出现异常");
        }
        return n;
    }


    @Override
    public int deleteClazz(Integer id) {
        int n = 0;
        try {
            n =clazzDao.deleteClazz(id);
        } catch (SQLException e) {
            System.err.print("删除班级信息出现异常");
        }
        return n;

    }

}
