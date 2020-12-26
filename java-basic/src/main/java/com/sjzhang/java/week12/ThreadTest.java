package com.sjzhang.java.week12;

/**
 * @ClassName ThreadTest
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/12/21
 **/
public class ThreadTest {
    private final Object flag = new Object();

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();

        OddThread oddThread = threadTest.new OddThread();
        oddThread.start();
        EvenThread evenThread = threadTest.new EvenThread();
        evenThread.start();
    }

    class OddThread extends Thread {
        @Override
        public void run() {
            synchronized (flag) {
                for (int i = 1; i <= 100; i += 2) {

                    flag.notify();

                    System.out.println(i);
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    class EvenThread extends Thread {
        @Override
        public void run() {
            synchronized (flag) {
                for (int i = 2; i < 100; i += 2) {

                    flag.notify();

                    System.out.println(i);
                    if (i == 100) {
                        break;
                    }
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
