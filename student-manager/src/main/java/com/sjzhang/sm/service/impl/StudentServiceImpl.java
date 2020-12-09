package com.sjzhang.sm.service.impl;

import com.sjzhang.sm.dao.StudentDao;
import com.sjzhang.sm.entity.Student;
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
            studentVoList = studentDao.selectAll();
        }catch (SQLException e) {
            System.err.print("查询学生信息出现异常");
        }
        return studentVoList;
    }

    @Override
    public List<StudentVo> selectByDepId(int depId) {
        List<StudentVo> studentVoList = null;
        try {
            studentVoList = studentDao.selectByDepId(depId);
        }catch (SQLException e) {
            System.err.print("查询院系信息出现异常");
        }
        return studentVoList;
    }

    @Override
    public List<StudentVo> selectByClassId(int classId) {
        List<StudentVo> studentVoList = null;
        try {
            studentVoList = studentDao.selectByClassId(classId);
        }catch (SQLException e) {
            System.err.print("查询班级信息出现异常");
        }
        return studentVoList;
    }

    @Override
    public List<StudentVo> selectByKeywords(String keywords) {
        List<StudentVo> studentVoList = null;
        try {
            studentVoList = studentDao.selectByKeywords(keywords);
        }catch (SQLException e) {
            System.err.print("查询信息出现异常");
        }
        return studentVoList;
    }

    @Override
    public int insertStudent(Student student) {
        int n = 0;
        try {
            n = studentDao.insertStudent(student);
        } catch (SQLException e) {
            System.err.println("新增学生出现异常");
        }
        return n;
    }

    @Override
    public int updateStudent(Student student) {
        int n = 0;
        try {
            n = studentDao.updateStudent(student);
        } catch (SQLException e) {
            System.err.println("修改学生出现异常");
        }
        return n;
    }

    @Override
    public int deleteById(String id) {
        int n = 0;
        try {
            n = studentDao.deleteById(id);
        } catch (SQLException e) {
            System.err.println("删除学生出现异常");
        }
        return n;
    }

    @Override
    public int countByDepartmentId(int departmentId) {
        int n = 0;
        try {
            n = studentDao.countByDepartmentId(departmentId);
        } catch (SQLException e) {
            System.err.println("根据院系统计学生数量出现异常");
        }
        return n;
    }

    @Override
    public int countStudentByClassId(int classId) {
        int n = 0;
        try {
            n = studentDao.countByClassId(classId);
        } catch (SQLException e) {
            System.err.println("根据班级统计学生数量出现异常");
        }
        return n;
    }


}
