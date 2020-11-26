package com.sjzhang.sm.service;

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
}
