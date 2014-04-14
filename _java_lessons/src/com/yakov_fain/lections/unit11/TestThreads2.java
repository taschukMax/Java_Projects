package com.yakov_fain.lections.unit11;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 4/14/14
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestThreads2 {
    public static void main(String[] args) {
        MarketNews mn = new MarketNews("Market news");
        Thread thread = new Thread(mn, "Market News");
        thread.start();
        Portfolio p = new Portfolio("Portfolio");
        Thread thread1 = new Thread(p, "Portfolio");
        thread1.start();
        System.out.println("TestThreads is finished");
    }
}
