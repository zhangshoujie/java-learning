package com.sjzhang.java.unit5.chapter9;

/**
 * @ClassName Example5_9
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/18
 **/
public class Example5_9 {
    public static void main(String[] args) {
        People people = new People();
        Anthropoid monkey = people;
        monkey.crySpeak("I love this game");
        System.out.println(monkey.m);
        System.out.println(people.m);
        People zhang = (People)monkey;
        zhang.computer(55,33);
        zhang.m = 'T';
        System.out.println(zhang.m);


    }

}
