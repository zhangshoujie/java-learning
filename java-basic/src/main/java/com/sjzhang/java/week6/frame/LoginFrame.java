package com.sjzhang.java.week6.frame;

import com.sun.org.apache.xml.internal.security.Init;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

/**
 * @ClassName LoginFrame
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/9
 **/
public class LoginFrame  extends JFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel bottomPanel;
    private JPanel logoPanel;
    private JPanel loginPanel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton 登录button;
    private JLabel tipLabel;
    private JLabel loginLabel;

    public LoginFrame() {
        //调用初始化方法
        init();
        登录button.addActionListener(e -> {
        LoginService ll = new LoginService();
        String account = accountField.getText();
        char[] password = passwordField.getPassword();
        String passString = new String(password);
        boolean result = true;
        try {
            result = ll.login(account, passString);
        }catch (SQLException e1) {
            e1.printStackTrace();
        }
        if (result) {
            JOptionPane.showMessageDialog(null, "登录成功" + account) ;
            LoginFrame.this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "登录失败");
        }
        });
    }
    private void init() {
        setTitle("LoginFrame");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }


    public static void main(String[] args) {
//        JFrame frame = new JFrame("LoginFrame");
//
//        frame.setContentPane(new LoginFrame().mainPanel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.setVisible(true);

        new LoginFrame();

   }
}
