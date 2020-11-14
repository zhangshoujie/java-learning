package com.sjzhang.java.week5;

import com.sjzhang.java.JFrame.TooHeavyException;

/**
 * @ClassName StudentService
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/2
 **/
public interface StudentService {
    public boolean checkHealth(Student student) throws TooWeightException, TooHeavyException;
}
