package com.sjzhang.java.week9;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

/**
 * @ClassName TxtFileTest
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/30
 **/
public class TxtFileTest {
    public static void main(String[] args) throws IOException {
        //1.将键盘输入的一串文本保存到文件中
        //使用filewriter结合字符数组写入（追加方式)
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        String fileName = UUID.randomUUID().toString();
        File file = new File("G:\\" + fileName + ".txt");
        Writer out = new FileWriter(file, true);
        out.write(chars);
        out.close();

        //2.BufferedWriter
        String b = scanner.nextLine();
        String fileName1 = UUID.randomUUID().toString();
        FileWriter fileWriter = new FileWriter("G:\\" + fileName1 + ".txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(b);
        writer.close();

        //3.打印流
        PrintStream ps = null;
        String fileName2 = UUID.randomUUID().toString();
        ps = new PrintStream(new FileOutputStream(new File("/G:/" + fileName2 + ".txt")));
        ps.print("abc");
        ps.close();

        

    }
}
