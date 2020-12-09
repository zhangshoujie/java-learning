package com.sjzhang.sm.service;

import com.sjzhang.sm.entity.Student;
import com.sjzhang.sm.vo.StudentVo;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName StudentService
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/23
 **/
public interface StudentService {
    List<StudentVo> selectAll();

    List<StudentVo> selectByDepId(int depId) ;

    List<StudentVo> selectByClassId(int classId) ;

    List<StudentVo> selectByKeywords(String keywords) ;

    int insertStudent(Student student);

    /**
     * 更新学生信息
     *
     * @param student 学生对象
     * @return int
     */
    int updateStudent(Student student);

    /**
     * 删除学生
     *
     * @param id id
     * @return int
     */
    int deleteById(String id);

    /**
     * 根据院系统计学生数
     *
     * @param departmentId 院系id
     * @return 学生数量
     */
    int countByDepartmentId(int departmentId);

    /**
     * 根据班级统计学生数量
     *
     * @param classId 班级id
     * @return 学生数量
     */
    int countStudentByClassId(int classId);

}
