package com.sjzhang.java.week3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @ClassName FormatUtil
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/19
 **/
public class FormatUtil {
    /*
    *将Date对象格式化为"yyyy-MM-dd HH:mm:ss"的格式
    *
    * @param date
    * @return
     */
    public synchronized static String format(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
    /*
    *将Date对象格式化为指定时区的字符串时间
    *
    * @param date
    * @param tz
    * @return
     */
    public synchronized static String format(Date date, Locale tz){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",tz);
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return sdf.format(date.getTime());
    }

    /*
    *将Date对象格式化为传入的指定格式返回
    *
    * @param date
    * @param regex
    * @return
     */

    public synchronized static String format(Date date,String regex){
        SimpleDateFormat sdf = new SimpleDateFormat(regex);
        return sdf.format(date);
    }

    /*
    *将入参的double数据格式化为指定格式返回
    *
    * @param number
    * @return
     */
    public static String format(double number, String pattern){
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return decimalFormat.format(number);
    }


}
