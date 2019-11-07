package com.apple.Reading;

/**
 * @program:
 * @Description:
 * @author: xujunhao
 * @date: 2019/11/4
 */
class Novel implements Reading{
    int Pages;
    double Price;

    public Novel(int pages, double price) {
        this.Pages = pages;
        this.Price = price;
    }

    public void Information(){
        System.out.println("THis is a Novel which have "+Pages+" pages, "+" you need "+Price+" yuan for it! ");
    }

}
