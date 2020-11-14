package com.sjzhang.java.week5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Book
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/2
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String ISBN;
    private  String name;
    private Integer price;

}
