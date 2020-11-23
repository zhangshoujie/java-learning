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
}
