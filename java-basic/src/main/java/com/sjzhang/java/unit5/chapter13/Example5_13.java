package com.sjzhang.java.unit5.chapter13;

/**
 * @ClassName Example5_13
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/27
 **/
public class Example5_13 {
    public static void main(String args[]) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
    }
}

