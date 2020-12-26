package com.sjzhang.java.week10;

/**
 * @ClassName ThreadExample
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/12/7
 **/
public class ThreadExample {
    public static void main(String[] args) {
        //两个对象，两个线程
        MyTread2 tic1 = new MyTread2("窗口1");
        MyTread2 tic2 = new MyTread2("窗口2");
        MyTread2 tic3 = new MyTread2("窗口3");

        tic1.start();
        tic2.start();
        tic3.start();
    }

    static class MyTread2 extends Thread{
        //用static修饰来保证ticket3的唯一性，Runnable中不用static修饰是因为Task2对象唯一
        private static int ticket3 = 5;
        public MyTread2(String name) {
            super(name);
        }
        @Override
        public void run() {
            while (true) {
                if (ticket3>0) {
                    System.out.println(this.getName() +"正在销售第"+ticket3+"张票");
                    ticket3--;
                } else {
                    System.out.println(this.getName() +"票已经销售完毕");
                    break;
                }
            }
        }
    }

}
