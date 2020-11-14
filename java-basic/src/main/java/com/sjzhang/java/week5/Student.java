package com.sjzhang.java.week5;

import lombok.Builder;

import java.nio.file.FileStore;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/2
 **/
@Builder
public class Student {
    private String name;
    private Integer weight;

    public Student(String name, Integer weight){
        this.name = name;
        this.weight = weight;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
