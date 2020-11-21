package com.sjzhang.sm.service;

import com.sjzhang.sm.entity.Clazz;

import java.util.List;

/**
 * @ClassName ClazzService
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/20
 **/
public interface ClazzService {
    /**
     *
     * @param department 班级
     * @return int
     */
    List<Clazz> getClazzByDepId(int department);


}
