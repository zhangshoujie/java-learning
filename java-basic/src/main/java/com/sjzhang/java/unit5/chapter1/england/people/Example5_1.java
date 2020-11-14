package com.sjzhang.java.unit5.chapter1.england.people;

import com.sjzhang.java.unit5.chapter1.american.people.Son;
import com.sjzhang.java.unit5.chapter1.japan.people.Grandson;

/**
 * @ClassName Example5_1
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/14
 **/
public class Example5_1 {
    public static void main(String args[]) {
        Son son=new Son();
        Grandson grandson=new Grandson();
        son.height = 180;
        son.hand = "一双大手";
        grandson.height = 155;
        grandson.hand = "一双小手";
        grandson.foot ="一双小脚";
        String str = son.getHand();
        System.out.printf("儿子：%s,%d\n",str,son.height);
        str = grandson.getHand();
        System.out.printf("孙子：%s,%s,%d\n",str,grandson.foot,grandson.height);
    }
}
