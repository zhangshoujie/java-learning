package com.sjzhang.java.week7;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/16
 **/
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(8);
        map.put("apple", 12);
        map.put("pear", 8);
        map.put("banana", 24);
        //for循环遍历
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "单价为：" + value);
        }
        Map<String, String> map1 = new HashMap<> (8);
        map1.put("中国","北京");
        map1.put("韩国","首尔");
        for (String key : map1.keySet()) {
            String value = map1.get(key);
            System.out.println(key + "的首都为：" + value);
        }

        System.out.println("iterator遍历");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "单价为：" + entry.getValue());
        }

        System.out.println("通过遍历Map 和 entrySet， 遍历 Key 和 Value， 推荐使用！");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ "单价为：" + entry.getValue());
        }

        System.out.println("lambda表达式遍历，强烈推荐！！");
        map.forEach((K, v) -> {
            System.out.println("key:" + K + ",value:" + v);
        });

    }
}
