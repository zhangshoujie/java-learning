package com.sjzhang.java.week3;

/**
 * @ClassName OverLoadTest
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/19
 **/
public class OverLoadTest {
    public int sum(int a, int b){
        return a + b;
    }
    public String sum(String s1, String s2) {
        return s1 + s2;

        /*StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s1);
        stringBuffer.append(s2);
        return stringBuffer.toString();*/
    }

}
