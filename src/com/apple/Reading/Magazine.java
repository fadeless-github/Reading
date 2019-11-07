package com.apple.Reading;

/**
 * @program:
 * @Description:
 * @author: xujunhao
 * @date: 2019/11/5
 */
public class Magazine implements Reading{
    int Pages;
    double Price;
    String Publishing_time;

    public Magazine(int pages, double price, String publishing_time) {
        this.Pages = pages;
        this.Price = price;
        this.Publishing_time = publishing_time;
    }
    public void Information(){
        System.out.println("THis is a Magazine, which was publishing "+Publishing_time+" have "+Pages+" pages, "+" you need "+Price+" yuan for it! ");
    }
}
