package com.sjzhang.java.week5;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/2
 **/
public interface BookService {
    boolean grounging(Book book) throws NotThirteenDigitsException, BookNameException, OverPriceException;
}
