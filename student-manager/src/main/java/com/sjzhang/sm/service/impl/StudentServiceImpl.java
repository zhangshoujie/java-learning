package com.sjzhang.sm.service.impl;

import com.sjzhang.sm.dao.StudentDao;
import com.sjzhang.sm.factory.DaoFactory;
import com.sjzhang.sm.service.StudentService;
import com.sjzhang.sm.vo.StudentVo;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/23
 **/
public class StudentServiceImpl implements StudentService {
    private final StudentDao studentDao = DaoFactory.getStudentDaoInstance();

    @Override
    public List<StudentVo> selectAll() {
        List<StudentVo> studentVoList = null;
        try {
            studentVoList = studentDao.getAll();
        }catch (SQLException e) {
            System.err.print("查询学生信息出现异常");
        }
        return studentVoList;
    }
}
