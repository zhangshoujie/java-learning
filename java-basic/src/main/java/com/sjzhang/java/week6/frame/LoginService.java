package com.sjzhang.java.week6.frame;

import java.sql.SQLException;
import java.sql.*;

/**
 * @ClassName LoginService
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/9
 **/
public class LoginService {
    String name = "";
    String pwd = "";

    public boolean login(String account, String password1) throws SQLException {
       DB db = new DB();
       User user = db.select(account,password1);
       name = user.getName();
       pwd = user.getPassword();
            if (account.equals(name) && password1.equals(pwd)) {
                return true;
            }else {
                return false;
            }

    }
}
