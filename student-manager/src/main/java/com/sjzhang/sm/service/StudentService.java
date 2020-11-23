package com.sjzhang.sm.service;

import com.sjzhang.sm.vo.StudentVo;

import java.util.List;

/**
 * @ClassName StudentService
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/23
 **/
public interface StudentService {
    List<StudentVo> selectAll();
}
