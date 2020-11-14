package com.sjzhang.java.unit5.chapter11;

/**
 * @ClassName Example5_11
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/22
 **/
abstract class GirlFriend {  //抽象类，封装了两个行为标准
    abstract void speak();
    abstract void cooking();
}
class ChinaGirlFriend extends GirlFriend {
    @Override
    void speak(){
        System.out.println("你好");
    }
    @Override
    void cooking(){
        System.out.println("水煮鱼");
    }
}
class AmericanGirlFriend extends GirlFriend {
    @Override
    void speak(){
        System.out.println("hello");
    }
    @Override
    void cooking(){
        System.out.println("roast beef");
    }
}
class Boy {
    GirlFriend friend;
    void setGirlfriend(GirlFriend f){
        friend = f;
    }
    void showGirlFriend() {
        friend.speak();
        friend.cooking();
    }
}
public class Example5_11 {
    public static void main(String args[]) {
        GirlFriend girl = new ChinaGirlFriend();
        Boy boy = new Boy();
        boy.setGirlfriend(girl);
        boy.showGirlFriend();
        girl = new AmericanGirlFriend();
        boy.setGirlfriend(girl);
        boy.showGirlFriend();
    }
}
