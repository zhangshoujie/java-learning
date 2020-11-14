package com.sjzhang.java.week6.frame;

/**
 * @ClassName User
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/9
 **/
public class User {
    private int id;
    private String name;
    private String password;
    public User() {
    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
