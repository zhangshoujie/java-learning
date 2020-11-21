package com.sjzhang.sm.frame;

import com.sjzhang.sm.entity.Clazz;
import com.sjzhang.sm.entity.Department;
import com.sjzhang.sm.factory.ServiceFactory;
import com.sjzhang.sm.utils.AliOSSUtil;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
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
    private JPanel leftPanel;
    private JPanel bottomPanel;
    private JPanel addDepPanel;
    private JTextField depNameField;
    private JButton 选择图片Button;
    private JPanel toolBarPanel;
    private JButton 新增院系Button;
    private JButton 切换显示Button;
    private JLabel LogoLabel;
    private JPanel contentPanel;
    private JButton 新增Button;
    private JPanel rightPanel;
    private JComboBox<Department> depCombobox;
    private JTextField searchField;
    private JButton 新增班级Button;
    private JPanel treePanel;
    private JPanel classContentPanel;

    private final CardLayout c;
    private String upLoadFileUrl;
    private File file;

    public MainFrame() {
        init();
        c = new CardLayout();
        centerPanel.setLayout(c);
        centerPanel.add("1", departmentPanel);
        centerPanel.add("2", classPanel);
        centerPanel.add("3", studentPanel);
        centerPanel.add("4", rewardPanel);
        院系管理button.addActionListener(e -> {
            c.show(centerPanel, "1");
            showDepartments();
        });
        班级管理button.addActionListener(e -> {
            c.show(centerPanel, "2");
            showClazz();
        });
        学生管理button.addActionListener(e -> {
            c.show(centerPanel, "3");
        });
        奖惩管理button.addActionListener(e -> {
            c.show(centerPanel, "4");
        });
        showDepartments();
        新增院系Button.addActionListener(e -> {
            //获取左侧面板的可见性
            boolean visible = addDepPanel.isVisible();
            //不可见
            if (!visible) {
                //向右侧展开、背景色变化、可见
                leftPanel.setPreferredSize(new Dimension(180, this.getHeight() - 100));
                addDepPanel.setVisible(true);
            } else {
                //向左侧展开、背景色变化、可见
                leftPanel.setPreferredSize(new Dimension(60, this.getHeight() - 100));
                addDepPanel.setVisible(false);
            }

            leftPanel.revalidate();
        });

        //院系名称文本框焦点监听
        depNameField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                depNameField.setText("");
            }
        });

        选择图片Button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            //默认打开路径
            fileChooser.setCurrentDirectory(new File("D:\\picture"));
            //对话框显示的范围在centerPanel内
            int result = fileChooser.showOpenDialog(centerPanel);
            if (result == JFileChooser.APPROVE_OPTION) {
                //选中文件
                file = fileChooser.getSelectedFile();
                String name = file.getAbsolutePath();
                //创建icon对象
                ImageIcon icon = new ImageIcon(name);
                LogoLabel.setPreferredSize(new Dimension(150, 150));
                //图片强制缩放成和JLabel一样大小
                icon = new ImageIcon(icon.getImage().getScaledInstance(LogoLabel.getWidth(), LogoLabel.getHeight(), Image.SCALE_DEFAULT));
                LogoLabel.setIcon(icon);
            }
        });
        新增Button.addActionListener(e -> {
            //上传文件代OSS并返回url
            upLoadFileUrl = AliOSSUtil.ossUpload(file);
            //创建Department对象，并对设置相应属性
            Department department = new Department();
            department.setDepartmentName(depNameField.getText().trim());
            department.setLogo(upLoadFileUrl);
            //调用service实现新增功能
            int n = ServiceFactory.getDepartmentServiceInstance().addDepartment(department);
            if (n == 1) {
                JOptionPane.showMessageDialog(centerPanel, "新增院系成功");
                //新增成功后，将侧边栏隐藏
                leftPanel.setPreferredSize(new Dimension(60, this.getHeight() - 100));
                addDepPanel.setVisible(false);
                //刷新界面数据
                showDepartments();
                //清空文本框
                depNameField.setText("");
                LogoLabel.setIcon(null);
            } else {
                JOptionPane.showMessageDialog(centerPanel, "新增院系失败");
            }
        });


    }

    public void init() {
        this.setTitle("管理员界面");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(966, 768);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void showClazz() {
        List<Department> departments = ServiceFactory.getDepartmentServiceInstance().selectAll();
        showConbobox(departments);
        showTree(departments);
        showClazz(departments);
    }

    private void showConbobox(List<Department> departments) {
        for (Department department : departments) {
            depCombobox.addItem(department);
        }
    }

    private void showTree(List<Department> departments) {
        treePanel.removeAll();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("南京工业职业技术大学");
        for (Department department : departments) {
            DefaultMutableTreeNode group = new DefaultMutableTreeNode(department.getDepartmentName());
            root.add(group);
            List<Clazz> clazzList = ServiceFactory.getClazzServiceInstance().getClazzByDepId(department.getId());
            for (Clazz clazz : clazzList) {
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(clazz.getClassName());
                group.add(node);
            }
        }
        final JTree tree = new JTree(root);
        tree.setRowHeight(30);
        tree.setFont(new Font("微软雅黑",Font.PLAIN, 14));
        treePanel.add(tree);
        treePanel.revalidate();
    }

    private void showClazz(List<Department> departments) {
        classContentPanel.removeAll();
        classContentPanel.setLayout(new GridLayout(0, 5, 15, 15));
        Font titleFont = new Font("微软雅黑", Font.PLAIN, 16);
        for (Department department : departments) {
            JPanel depPanel = new JPanel();
            depPanel.setPreferredSize(new Dimension(120, 150));
            depPanel.setBackground(new Color(63, 98, 131));
            depPanel.setLayout(new BorderLayout());
            JLabel depNameLabel = new JLabel(department.getDepartmentName());
            depNameLabel.setFont(titleFont);
            depNameLabel.setForeground(new Color(255, 255, 255));
            depPanel.add(depNameLabel, BorderLayout.NORTH);
            List<Clazz> clazzList = ServiceFactory.getClazzServiceInstance().getClazzByDepId(department.getId());
            DefaultListModel<Clazz> listModel = new DefaultListModel<>();
            for (Clazz clazz : clazzList) {
                listModel.addElement(clazz);
            }
            JList<Clazz> jlist = new JList<>(listModel);
            jlist.setBackground(new Color(101, 134, 184));
            JScrollPane srollPane = new JScrollPane(jlist);
            depPanel.add(srollPane, BorderLayout.CENTER);
            classContentPanel.add(depPanel);
        }
    }

    /**
     * 显示所有院系
     */
    private void showDepartments() {
        //移除原有数据
        contentPanel.removeAll();
        //从service层获取到多有院系列表
        List<Department> departmentList = ServiceFactory.getDepartmentServiceInstance().selectAll();
        //获取总数
        int len = departmentList.size();
        //根据院系总数算出行数（每行放4个）
        int row = len % 4 == 0 ? len / 4 : len / 4 + 1;
        //创建一个网格布局，每行4列，指定水平和垂直间距
        GridLayout gridLayout = new GridLayout(row, 4, 15, 15);
        contentPanel.setLayout(gridLayout);
        for (Department department : departmentList) {
            //给每个院系对象创建一个面板
            JPanel depPanel = new JPanel();
            depPanel.setPreferredSize(new Dimension(220, 200));
            depPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 10));

            JLabel nameLabel = new JLabel(department.getDepartmentName());
            //设置合适大小
//            depPanel.setPreferredSize(new Dimension(200,200));
//            //将院系名称设置给面板标题
//            depPanel.setBorder(BorderFactory.createTitledBorder(department.getDepartmentName()));
            //新建一个JLabel标签，用来放置院系Logo，并设置大小  width=200 height=105
            JLabel logoLabel = new JLabel("<html><img src= '" + department.getLogo() + "' width='200' height='105'/></html>");
            //占位空白标签
            JLabel blankLabel = new JLabel();
            blankLabel.setPreferredSize(new Dimension(200, 30));
            //删除按钮
            JButton delBtn = new JButton("删除");
            //删除院系
            delBtn.addActionListener(e -> {
                int n = ServiceFactory.getDepartmentServiceInstance().delDepartment(department, department.getId());
                if (n == 1) {
                    JOptionPane.showMessageDialog(centerPanel, "删除院系成功");
                    showDepartments();
                } else {
                    JOptionPane.showMessageDialog(centerPanel, "删除院系失败");
                }
            });

            //院系名称标签加入院系面板
            depPanel.add(nameLabel);
            //图标标签加入院系面板
            depPanel.add(logoLabel);
            //按钮加入院系面板
            depPanel.add(delBtn);
            //delBtn.setBounds(20,0,20,20);
            //院系面板加入主题内容面板
            contentPanel.add(depPanel);
            //刷新主体内容面板
            contentPanel.revalidate();
        }
    }

    public static void main(String[] args) {
        new MainFrame();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
