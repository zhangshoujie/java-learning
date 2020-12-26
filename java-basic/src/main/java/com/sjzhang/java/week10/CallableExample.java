package com.sjzhang.java.week10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName Callable
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/12/7
 **/
class CallabelExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Ticket tickets = new Ticket(10);
        TicketWindow tw = new TicketWindow(tickets);
        for(int i=1; i<4; i++){
            FutureTask<Void> ft = new FutureTask<Void>(tw);
            //每个线程都需要new一个新的FutureTask,否则会出现只有一个窗口卖票
            Thread t = new Thread(ft,"TickWindow-" + i);
            t.start();
        }
    }
}

class TicketWindow implements Callable<Void>{
    //private int tickets = 10;//车票总量

    private Ticket tickets;

    public TicketWindow(Ticket tickets){
        this.tickets = tickets;
    }

    @Override
    public Void call(){
        while(true){
            synchronized (tickets) {
                int currentNo = tickets.getNum();
                if(currentNo>0){
                    System.out.println(Thread.currentThread().getName() + "准备出票,剩余票数:" + currentNo + "张");
                    --currentNo;
                    tickets.setNum(currentNo);
                    System.out.println(Thread.currentThread().getName() + "卖出一张,剩余票数:" + currentNo + "张");
                    try {
                        Thread.sleep(500);
                        //出票成功后让当前售票窗口睡眠,以便让其他售票窗口卖票

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //Thread.yield();
                }
                else{
                    System.out.println(Thread.currentThread().getName() + "余票不足,停止售票!");
                    break;
                }
            }
        }
        return null;
    }
}

class Ticket {
    private int num;

    public Ticket(int n) {
        this.num = n;
    }

    public void setNum(int n) {
        this.num = n;
    }

    public int getNum() {
        return num;
    }
}
