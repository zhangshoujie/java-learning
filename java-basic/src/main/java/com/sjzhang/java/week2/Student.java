package com.sjzhang.java.week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/12
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String id;
    private String studentName;
    private String gender;
    private Phone phone;
    private Book[] book;
}
