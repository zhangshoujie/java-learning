package com.sjzhang.java.week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @ClassName Book
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/10/12
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
class Book {
    private String name;
    private Integer price;
    private Date publishDate;
    public Book(String name, int price, Date date){
        this.name = name;
        this.price = price;
        this.publishDate = date;
    }

    @Override
    public String toString() {
        return "《" + name + "》的价格:" + price + ",出版时间" + publishDate;
    }

    public static void main(String[] args) {
        Book book = new Book("java", 20, new Date());
        System.out.println(book);
    }


}
