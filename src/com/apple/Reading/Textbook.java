package com.apple.Reading;

/**
 * @program:
 * @Description:
 * @author: xujunhao
 * @date: 2019/11/5
 */
public class Textbook {
    int Pages;
    double Price;

    public Textbook(int pages, double price) {
        Pages = pages;
        Price = price;
    }
    public void Information(){
        System.out.println("THis is a Textbook which have "+Pages+" pages, "+" you need "+Price+" yuan for it! ");
    }

}
