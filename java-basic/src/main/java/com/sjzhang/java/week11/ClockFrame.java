package com.sjzhang.java.week11;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * @ClassName ClockFrame
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/12/14
 **/
public class ClockFrame extends JFrame implements Runnable{
    private JLabel timeLabel;
    private JPanel timePanel;
    private TimerTask timerTask;
    private Timer timer;
    public ClockFrame() {
        init();
        setTitle("闹钟窗体");
        setSize(new Dimension(500, 400));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void init() {
        timeLabel = new JLabel();
        timePanel = new JPanel(){
            @Override
            protected void printComponent(Graphics g) {
                //绘制背景图
                File file;
                try {
                    Image bg = ImageIO.read(new File("/D:/qq.png"));
                    g.drawImage(bg, 0, 0, getWidth(), getHeight(),null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        Font font = new Font("微软雅黑", Font.BOLD, 20);
        timeLabel.setFont(font);
        timePanel.setPreferredSize(new Dimension(300, 200));
        timePanel.add(timeLabel);
        add(timePanel);
        //创建定时任务
        timerTask = new TimerTask() {
            @Override
            public void run() {
                //1.通过Date对象和SimpleDateFormat格式化时间
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String timeString = sdf.format(date);
                timeLabel.setText(timeString);
                //2.使用localDateTime处理时间

                //判断档期那时间是否和预设时间相等
                if ("2020-12-14 14:15:20".equals(timeString)) {
                    JOptionPane.showMessageDialog(timePanel, "第一个闹钟时间到了。。");
                }
                if ("2020-12-14 14:45:20".equals(timeString)) {
                    JOptionPane.showMessageDialog(timePanel, "第二个闹钟时间到了。。");
                    //仍无全部执行完成，取消周期性执行计划
                    this.cancel();
                }
            }
        };
//        //创建Timer对象
//        timer = new Timer();
//        //按固定频率执行任务，演示为0，周期1秒，执行timerTask
//        timer.scheduleAtFixedRate(timerTask, 0, 1000);


    }

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(new ClockFrame(), 0,1000, TimeUnit.MILLISECONDS);
        //new ClockFrame();
    }

    @Override
    public void run() {
        //1.通过Date对象和SimpleDateFormat格式化时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeString = sdf.format(date);
        timeLabel.setText(timeString);
        //2.使用localDateTime处理时间

        //判断档期那时间是否和预设时间相等
        if ("2020-12-14 14:15:20".equals(timeString)) {
            JOptionPane.showMessageDialog(timePanel, "第一个闹钟时间到了。。");
        }
        if ("2020-12-14 14:45:20".equals(timeString)) {
            JOptionPane.showMessageDialog(timePanel, "第二个闹钟时间到了。。");

        }
    }
}
