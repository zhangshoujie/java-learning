package com.sjzhang.java.week5;

import java.util.regex.Pattern;

/**
 * @ClassName BookServiceImpl
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/2
 **/
public class BookServiceImpl {
    public  boolean grounding(Book book) throws  NotThirteenDigitsException, BookNameException, OverPriceException{
        Pattern pattern = Pattern.compile("[0-9]*");
        String isbn = book.getISBN();
        String name = book.getName();
        int price = book.getPrice();

        if(isbn.length() != 13 || pattern.matcher(isbn).matches()){
            throw new NotThirteenDigitsException("ISBN不是13位数字组成!");
        }else if (name.contains("暴力") || name.contains("恐怖")){
            throw new BookNameException("书中含有禁词！");
        }else if (price > 100){
            throw new OverPriceException("价格超过100元");

        }else {
            return true;
        }



    }
}
