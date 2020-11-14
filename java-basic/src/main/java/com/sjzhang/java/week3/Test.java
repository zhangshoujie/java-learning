package com.sjzhang.java.week3;

import java.util.Date;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/19
 **/
class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    // (1).diaplay() 打印时、分、秒
    public void diaplay() {
        String HH;
        String MM;
        String SS;
        if(this.hour < 10) {
            HH = "0" + this.hour;
        } else {
            HH = "" +  this.hour;
        }
        if(this.minute < 10) {
            MM = "0" + this.minute;
        } else {
            MM = "" +  this.minute;
        }
        if(this.second < 10) {
            SS = "0" + this.second;
        } else {
            SS = "" + this.second;
        }
        System.out.println(HH + ":" + MM + ":" + SS);
    }
    // (2).addSecond(int sec) 对秒进行加运算。
    public void addSecond(int sec) {
        int ss = sec % 60;
        int mm = (sec / 60) % 60;
        int hh = sec / (60 * 60);
        if ((this.second + ss) < 60) {
            this.second += ss;
            this.minute += mm;
            if(this.minute > 60) {
                this.minute = this.minute % 60;
                this.hour++;
                this.hour += hh;
                if(this.hour > 24) {
                    this.hour = this.hour % 24;
                }
            }
            this.hour += hh;
            if(this.hour > 24 ){
                this.hour = this.hour % 24;
            }
        } else {
            this.second = (this.second + ss) % 60;
            this.minute++;
            this.minute += mm;
            if(this.minute > 60) {
                this.minute = this.minute % 60;
                this.hour++;
                this.hour += hh;
                if(this.hour > 24) {
                    this.hour = this.hour % 24;
                }
            }
            this.hour += hh;
            if(this.hour > 24 ){
                this.hour = this.hour % 24;
            }
        }
        diaplay();
    }

    // (3).addMinute(int min) 对分进行加运算。
    public void addMinute(int min) {
        int mm = min % 60;
        int hh = min /60;
        if ((this.minute + mm) < 60) {
            this.minute += mm;
            this.hour += hh;
            if(this.hour > 24) {
                this.hour = this.hour % 24;
            }
        } else {
            this.minute = (this.minute + mm) % 60;
            this.hour++;
            this.hour += hh;
            if(this.hour > 24) {
                this.hour = this.hour % 24;
            }
        }
        diaplay();
    }

    // (4).addHour(int hou) 对时进行加运算。
    public void addHour(int hou) {
        if ((this.hour + hou) < 24) {
            this.hour += hou;
        } else {
            this.hour = (this.hour + hou) % 24;
        }
        diaplay();
    }
    // (5).subSecond(int sec) 对秒进行减运算。
    public void subSecond(int sec) {
        int ss = sec % 60;
        int mm = (sec / 60) % 60 ;
        int hh = sec / (60 * 60);
        if ((this.second - ss) >= 0) {
            this.second -= ss;
            this.minute -= mm;
            if(this.minute < 0) {
                this.minute = this.minute + 60;
                this.hour--;
                if(this.hour < 0) {
                    this.hour += 24;
                }
            }
            this.hour -= hh;
            if(this.hour < 0) {
                this.hour += 24;
            }
        } else {
            this.second = this.second + 60 -ss;
            this.minute--;
            if((this.minute - mm) >= 0) {
                this.minute -= mm;
            } else {
                this.minute = (this.minute + 60 -mm) % 60;
                this.hour--;
                if((this.hour - hh) >= 0) {
                    this.hour -= hh;
                } else {
                    this.hour = (this.hour  -hh) % 24 + 24;
                }
            }
        }
        diaplay();
    }

    // (6).subMinute(int min) 对分进行减运算。
    public void subMinute(int min) {
        int mm = min % 60;
        int hh = min / 60;
        if ((this.minute - mm) >= 0) {
            this.minute -= mm;
            this.hour -= hh;
            if(this.hour < 0) {
                this.hour = this.hour % 24 + 24;
            }
        } else {
            this.minute = (this.minute + 60 -mm) % 60;
            this.hour--;
            if((this.hour - hh) >= 0) {
                this.hour -= hh;
            } else {
                this.hour = ((this.hour -hh) % 24 + 24) % 24;
            }
        }
        diaplay();
    }

    // (7).subHour(int hou) 对时进行减运算。
    public void subHour(int hou) {
        hou = hou %24;
        if((this.hour - hou) >= 0) {
            this.hour -= hou;
        } else {
            this.hour = (this.hour + 24 -hou) % 24;
        }
        diaplay();
    }
}

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        MyTime time = new MyTime(15, 37, 50);
        time.diaplay();
        time.addSecond(500);
    }
}

