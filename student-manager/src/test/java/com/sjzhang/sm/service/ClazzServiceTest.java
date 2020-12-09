package com.sjzhang.sm.service;

import com.sjzhang.sm.entity.Clazz;
import com.sjzhang.sm.entity.Department;
import com.sjzhang.sm.factory.ServiceFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ClazzServiceTest {
    private final ClazzService clazzService = ServiceFactory.getClazzServiceInstance();
    @Test
    public void selectAll() {
        List<Clazz> clazzList = clazzService.selectAll();
        clazzList.forEach(System.out::print);
    }
}