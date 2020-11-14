package com.sjzhang.java.unit5.chapter13;

/**
 * @ClassName Simulator
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/27
 **/
public class Simulator {
    public void playSound(Animal animal) {
        System.out.print("现在播放"+animal.getAnimalName()+"类的声音:");
        animal.cry();
    }
}

