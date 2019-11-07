package com.apple.Reading;

/**
 * @program:
 * @Description:
 * @author: xujunhao
 * @date: 2019/11/5
 */
public class Manager {
    public static void main(String[] args){
        Magazine magazine1 = new Magazine(30,15,"October 2019");
        Novel novel1 = new Novel(300,50);
        Periodical periodical1 = new Periodical(25,15,"October 7,2019");
        Textbook textbook1 = new Textbook(345,45);

        magazine1.Information();
        novel1.Information();
        periodical1.Information();
        textbook1.Information();
    }
}
