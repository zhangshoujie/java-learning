package com.sjzhang.sm.dao;

import com.sjzhang.sm.entity.Student;
import com.sjzhang.sm.vo.StudentVo;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName StudentDao
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/23
 **/
public interface StudentDao {
    /**
     * 查询所有学生(视图对象)
     * @return 学生视图列表数据
     * @throws SQLException 异常
     */
    List<StudentVo> selectAll() throws SQLException;

    /**
     * 得到
     * @return 学生
     * @throws SQLException 异常
     */
    List<StudentVo> getAll() throws SQLException;

    List<StudentVo> selectByDepId(int depId) throws SQLException;

    List<StudentVo> selectByClassId(int classId) throws SQLException;

    List<StudentVo> selectByKeywords(String keywords) throws SQLException;

    /**
     *
     * @param studentVo 新增学生
     * @return int
     * @throws SQLException 异常
     */
    public int insertStudent(Student student) throws SQLException;

    /**
     * 根据id删除学生
     *
     * @param id 学生id
     * @return int
     * @throws SQLException 异常
     */
    int deleteById(String id) throws SQLException;

    /**
     * 根据院系id统计学生人数
     *
     * @param departmentId 院系id
     * @return int
     * @throws SQLException 异常
     */
    int countByDepartmentId(int departmentId) throws SQLException;

    /**
     * 更新学生信息
     *
     * @param student 入参
     * @return int
     * @throws SQLException 异常
     */
    int updateStudent(Student student) throws SQLException;

    /**
     * 根据班级id统计生人数
     *
     * @param classId 班级id
     * @return int
     * @throws SQLException 异常
     */
    int countByClassId(int classId) throws SQLException;
}
