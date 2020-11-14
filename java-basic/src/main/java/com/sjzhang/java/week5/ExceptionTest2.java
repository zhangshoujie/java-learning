package com.sjzhang.java.week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName ExceptionTest2
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/2
 **/
public class ExceptionTest2 {
    public static void main(String[] args) {
//        File file = new File("D:\\java learning\\picture\\后端学习路线.jpg");
//        InputStream is = new FileInputStream(file);
        //在方法调用处捕获异常,这样的好处是：即使出现异常，也不会影响其他代码段的运行
        try {
            byte[] b = readFile("D:\\java learning\\picture\\后端学习路线.jpg");
            System.out.println(b.length);
        }catch (IOException e) {
            System.out.println("出现IO异常");
        }
        finally {//常常用于数据库的关闭，线程池资源回收，IO流的关闭
            System.out.println("无论有无异常都会执行的代码段！");
        }
        System.out.println("************");
        System.out.println("其他代码");
    }


    public static byte[] readFile(String path) throws IOException {
        File file = new File(path);
        byte[] b = new byte[(int)file.length()];
        InputStream is = new FileInputStream(file);
        int result = is.read(b);
        System.out.println(result);
        is.close();
        return b;

    }

}
