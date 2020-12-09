package com.sjzhang.sm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Clazz
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/20
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Clazz {


    private Integer id;
    private Integer departmentId;
    private String className;
    
    @Override
    public String toString() {
        return className;
    }

}
