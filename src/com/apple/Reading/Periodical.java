package com.apple.Reading;

/**
 * @program:
 * @Description:
 * @author: xujunhao
 * @date: 2019/11/5
 */
public class Periodical {
    int Pages;
    double Price;
    String Publishing_time;

    public Periodical(int pages, double price, String publishing_time) {
        Pages = pages;
        Price = price;
        Publishing_time = publishing_time;
    }
    public void Information(){
        System.out.println("THis is a Periodical, which was publishing "+Publishing_time+" have "+Pages+" pages, "+" you need "+Price+" yuan for it! ");
    }
}
