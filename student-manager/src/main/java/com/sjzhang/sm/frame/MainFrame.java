package com.sjzhang.sm.frame;

import com.sjzhang.sm.entity.Department;
import com.sjzhang.sm.factory.ServiceFactory;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * @ClassName MainFrame
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/15
 **/
public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JButton 院系管理button;
    private JButton 班级管理button;
    private JButton 学生管理button;
    private JButton 奖惩管理button;
    private JPanel centerPanel;
    private JPanel departmentPanel;
    private JPanel classPanel;
    private JPanel studentPanel;
    private JPanel rewardPanel;

    private final CardLayout c;

    public MainFrame() {
        init();
        院系管理button.setOpaque(false);
        班级管理button.setOpaque(false);
        学生管理button.setOpaque(false);
        奖惩管理button.setOpaque(false);
        c = new CardLayout();
        centerPanel.setLayout(c);
        centerPanel.add("1", departmentPanel);
        centerPanel.add("2", classPanel);
        centerPanel.add("3", studentPanel);
        centerPanel.add("4", rewardPanel);
        院系管理button.addActionListener(e -> {
            c.show(centerPanel, "1");
        });
        班级管理button.addActionListener(e -> {
            c.show(centerPanel, "2");
        });
        学生管理button.addActionListener(e -> {
            c.show(centerPanel, "3");
        });
        奖惩管理button.addActionListener(e -> {
            c.show(centerPanel, "4");
        });
        showDepartments();
    }

    public void init() {
        this.setTitle("管理员界面");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }
    /**
     * 显示所有院系
     */
    private void showDepartments(){
        //移除原有数据
        departmentPanel.removeAll();
        //从service层获取到多有院系列表
        List<Department> departmentList = ServiceFactory.getDepartmentServiceInstance().selectAll();
        //获取总数
        int len = departmentList.size();
        //根据院系总数算出行数（每行放4个）
        int row = len % 4 == 0 ? len / 4 : len / 4 + 1;
        //创建一个网格布局，每行4列，指定水平和垂直间距
        GridLayout gridLayout = new GridLayout(row, 4, 15, 15);
        departmentPanel.setLayout(gridLayout);
        for (Department department : departmentList) {
            //给每个院系对象创建一个面板
            JPanel depPanel = new JPanel();
            //设置合适大小
            depPanel.setPreferredSize(new Dimension(200,200));
            //将院系名称设置给面板标题
            depPanel.setBorder(BorderFactory.createTitledBorder(department.getDepartmentName()));
            //新建一个JLabel标签，用来放置院系Logo，并设置大小
            JLabel logoLabel = new JLabel("<html><img src='" + department.getLogo() + "' width=200 height=150/><ml>");
            //图标标签加入院系面板
            depPanel.add(logoLabel);
            //院系面板加入主题内容面板
            departmentPanel.add(depPanel);
            //刷新主体内容面板
            departmentPanel.revalidate();
        }
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
