package com.sjzhang.sm.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ResultEntity
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/14
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultEntity {
    private int code;
    private String message;
    private Object data;
}
