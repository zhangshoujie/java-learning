package com.sjzhang.sm.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName StudentVo
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/23
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentVo {
    private String id;
    private String departmentName;
    private String className;
    private String studentName;
    private String phone;
    private short gender;
    private Date birthday;
    private String avatar;
    private String address;


}
