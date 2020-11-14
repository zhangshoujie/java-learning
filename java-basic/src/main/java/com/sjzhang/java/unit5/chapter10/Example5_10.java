package com.sjzhang.java.unit5.chapter10;

/**
 * @ClassName Example5_10
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/21
 **/
class 动物{
    void cry(){
    }
}
class 狗 extends 动物{
    void cry() {
        System.out.println("这是狗的叫声： 汪汪...汪汪");
    }
}
class 猫 extends 动物{
    void cry() {
        System.out.println("这是猫的叫声： 喵喵...喵喵...");
    }
}
public class Example5_10 {
    public static void main(String[] args) {
        动物 animal = new 狗();
        animal.cry();
        animal = new 猫();
        animal.cry();
    }

}
