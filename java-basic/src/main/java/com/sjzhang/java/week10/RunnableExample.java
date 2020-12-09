package com.sjzhang.java.week10;

import sun.security.krb5.internal.Ticket;

/**
 * @ClassName ThreadExample
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/12/7
 **/
public class ThreadExample {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread th1 = new Thread(t, "窗口A");
        Thread th2 = new Thread(t, "窗口B");
        Thread th3 = new Thread(t, "窗口C");

        th1.start();
        th2.start();
        th3.start();

    }

    class Ticket implements Runnable{

        private int TicketNum = 100; //100张火车票
        private boolean flag = true;
        private synchronized void sale()
        {
            if(TicketNum<=0)
            {
                flag = false;
                return ;
            }
            TicketNum--;
            System.out.println(Thread.currentThread().getName()+"卖了一张票，还剩"+TicketNum+"张票。");
        }

        @Override
        public void run() {
            while(flag)
            {
                sale();
        }
    }
