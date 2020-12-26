package com.sjzhang.java.week10.jdbc;

import lombok.val;

import java.sql.*;

/**
 * @ClassName JdbcDemo1
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/12/14
 **/
public class JdbcDemo1 {
    private final  static String JDBC_DRIVER = "com.mysql.cj.jdbc.driver";
    private final  static String DB_URL = "jdbc:mysql://localhost:3306/student_manager";
    private final  static String USER_NAME = "root";
    private final  static String PASSWORD = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载jdbc
        Class.forName(JDBC_DRIVER);
        //2.建立数据库连接
        Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        //3.实例化PreparedStatement对象
        Statement statement = conn.createStatement();
        //4.拼SQL语句
        String sql = "SELECT * FROM t_student ";
        //5.执行CRUD操作(本例为查询)
        ResultSet rs = statement.executeQuery(sql);
        //6.处理结果集
        while (rs.next()) {
            //字段取值
            
        }

    }


}
