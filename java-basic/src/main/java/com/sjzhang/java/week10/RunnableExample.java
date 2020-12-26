package com.sjzhang.java.week10;

import sun.security.krb5.internal.Ticket;

/**
 * @ClassName ThreadExample
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/12/7
 **/
public class RunnableExample {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread th1 = new Thread(t, "001");
        Thread th2 = new Thread(t, "002");
        Thread th3 = new Thread(t, "003");

        th1.start();
        th2.start();
        th3.start();

    }

    static class Ticket implements Runnable{
        private int ticketNum = 5;
        private boolean flag = true;
        private synchronized void sale() {
            if(ticketNum<=0) {
                flag = false;
                return ;
            }
            ticketNum--;
            System.out.println("窗口" + Thread.currentThread().getName()+"卖了一张票，还剩"+ticketNum+"张票。");
        }
        @Override
        public void run() {
            while(flag)
            {
                sale();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }
    }
