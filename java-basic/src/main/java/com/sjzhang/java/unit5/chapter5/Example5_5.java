package com.sjzhang.java.unit5.chapter5;

/**
 * @ClassName Example5_5
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/16
 **/
class CreatPeople {
    public People creatPeople() {
        People p=new People();
        return p;
    }
}
class CreatChinese extends CreatPeople {
    @Override
    public Chinese creatPeople() {
        Chinese chinese=new Chinese();
        return chinese;
    }
}
public class Example5_5 {
    public static void main(String args[]) {
        CreatChinese create=new CreatChinese();
        Chinese zhang=create.creatPeople();
        zhang.speak();
    }
}

