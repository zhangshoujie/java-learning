package com.sjzhang.java.week9;

import java.io.File;
import java.time.LocalDate;

/**
 * @ClassName FileTest
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/30
 **/
public class FileTest {
    public static void main(String[] args) {
//        //创建文件
//        File file = new File("D:" + File.separator + "1.txt");
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getName());
//        //2.创建文件夹（目录)
//        File dir = new File("D:\\hello");
//        if (!dir.exists()) {
//            boolean flag = dir.mkdirs();
//            System.out.println(flag);
//        }
        //1.课堂练习：创建目录，用当前系统日期命名，然后删除这个目录
        LocalDate today = LocalDate.now();
        String dirname = today.getYear() + "-" + today.getMonthValue() + "-" + today.getDayOfMonth();
        File dir1 = new File("D:\\" + dirname);
        if (!dir1.exists()) {
            boolean e = dir1.mkdirs();
            System.out.println(e);
        }
        //课堂练习1-2:删除刚才创建的目录，注意判断是否存在
        if (dir1.exists()) {
            boolean e = dir1.delete();
            System.out.println(e);
        }
        //课堂练习1-3:递归创建目录，顶级目录名：Java，一级目录名：面向对象、异常、集合、io、多线程，io下目录：字节流、字符流
        File f = new File("G:\\java");
        System.out.println(f.mkdirs());
        String[] a = new String[] {"面向对象","异常","集合","io","多线程"};
        String[] b = new String[] {"字节流", "字符流"};
        for (String i : a) {
            File file1 = new File("G:\\java" + i);
            if (!file1.exists()) {
                boolean e = file1.mkdirs();
                System.out.println(e);
            }
            if(i.equals("io")) {
                for(String j : b) {
                    File file2 = new File("G:\\java\\io\\" + j);
                    if (!file2.exists()) {
                        boolean e = file2.mkdirs();
                        System.out.println(e);
                    }
                }
            }
        }



    }
}
