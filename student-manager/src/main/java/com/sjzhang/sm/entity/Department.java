package com.sjzhang.sm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Department
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/17
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    private Integer id;
    private String departmentName;
    private String logo;
}
