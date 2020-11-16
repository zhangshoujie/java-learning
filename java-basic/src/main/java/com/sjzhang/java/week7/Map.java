package com.sjzhang.java.week7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @ClassName Map
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/16
 **/
public class Map {
    public static void main(String[] args) {
        java.util.Map<String, String> map = new HashMap<>(8);
        map.put("Tom","CoreJava");
        map.put("John","Oracle");
        map.put("Susan","Oracle");
        map.put("Jerry","JDBC");
        map.put("Jim","Unix");
        map.put("Kevin","JSP");
        map.put("Lucy","JSP");

        map.put("Allen","JDBC");
        //Lucy改为教CoreJava
        Set<java.util.Map.Entry<String, String>> entrySet = map.entrySet();
        for (Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            if (key.equals("Lucy")) {
                entry.setValue("CoreJava");
            }
        }
        for (Entry<String, String> entry : entrySet) {
            System.out.println("老师：" + entry.getKey() + "  课程：" + entry.getValue());
        }
        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            System.out.println("老师：" + key + "  课程：" + value);
        }
        //输出所有教JDBC的老师
        for (Entry<String, String> entry : entrySet) {
            if(entry.getValue().equals("JDBC")){
                System.out.println(entry.getKey());
            }
        }

    }
}
