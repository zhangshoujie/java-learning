package com.sjzhang.java.week5;

/**
 * @ClassName TooWeightException
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/2
 **/
public class TooWeightException extends Throwable {
    private String msg;

    public TooWeightException(){
        super();
    }
    public TooWeightException(String msg) {
        super();
        this.msg = msg;
    }

    public String showMsg(){
        return msg;
    }
}
