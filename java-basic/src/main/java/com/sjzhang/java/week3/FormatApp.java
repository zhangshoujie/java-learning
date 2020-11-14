package com.sjzhang.java.week3;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Date;

/**
 * @ClassName FormatApp
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/19
 **/
public class FormatApp {
    public static void main(String[] args) {
        //统一格式化时间
        System.out.println(FormatUtil.format(new Date(),"yyyy年MM月dd日 HH:mm:ss"));
        //自定义格式化时间
        System.out.println(FormatUtil.format(new Date(),"yyyy年MM月dd日 HH:mm"));

        Date date = new Date();
        System.out.println(FormatUtil.format(date));
        System.out.println(FormatUtil.format(date,"yyyy年MM月dd日 HH:mm"));



    }
}
