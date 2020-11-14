package com.sjzhang.java.unit4;

/**
 * @ClassName People
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/10
 **/
public class People {
    int leg,hand;
    String name;
    People(String s){
        name = s;
        this.init();
    }
    void init(){
        leg = 2;
        hand = 2;
        System.out.println(name + "有" + hand + "只手" + leg + "条腿");
    }

    public static void main(String[] args) {
        People boshi = new People("布什");
    }
}
