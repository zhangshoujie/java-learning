package com.sjzhang.java.unit4;

/**
 * @ClassName Example4_1
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/10
 **/
public class Example4_1 {
    public static void main(String[] args) {
        com.sjzhang.java.unit4.chapter2.XiyoujiRenwu zhubajie,sunwukong;
        zhubajie = new com.sjzhang.java.unit4.chapter2.XiyoujiRenwu();
        sunwukong = new com.sjzhang.java.unit4.chapter2.XiyoujiRenwu();
    }
}
class XiyoujiRenwu{
    float height,weight;
    String  head,ear;
    void speak(String s) {
        System.out.println(s);
    }
}
