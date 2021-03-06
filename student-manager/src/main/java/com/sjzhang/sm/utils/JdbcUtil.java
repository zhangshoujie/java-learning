package com.sjzhang.sm.utils;

import java.sql.*;

/**
 * @ClassName JdbcUtil
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/14
 **/
public class JdbcUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/student_manager?useUnicode=true&characterEncoding=UTF-8&useSSL=false&autoReconnect=true&failOverReadOnly=false&serverTimezone=GMT%2B8";

    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static Connection connection = null;
    private static JdbcUtil jdbcUtil = null;

    /**
     * 获取JDBCUtil实例
     *
     * @return JDBCUtil实例
     */
    public static JdbcUtil getInitJdbcUtil() {
        if (jdbcUtil == null) {
            //线程加锁
            synchronized (JdbcUtil.class) {
                if (jdbcUtil == null) {
                    //懒汉式加载
                    jdbcUtil = new JdbcUtil();
                }
            }
        }
        return jdbcUtil;
    }

    private JdbcUtil() {
    }

    //通过静态代码块注册数据库驱动，保持注册只执行一次
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     *
     * @return CONNECTION
     */
    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL ,USERNAME, PASSWORD);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    /**
     * 关闭连接
     */
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            }catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Connection connection = JdbcUtil.getInitJdbcUtil().getConnection();
        if (connection != null) {
            System.out.println("连接成功");
        }
    }
}

