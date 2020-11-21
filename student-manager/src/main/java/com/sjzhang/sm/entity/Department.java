package com.sjzhang.sm.entity;

import lombok.*;

/**
 * @ClassName Department
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/17
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    private Integer id;
    private String departmentName;
    private String logo;
    @Override
    public String toString() {
        return this.departmentName;
    }
}
