package com.yakov_fain.lections.unit11;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 4/14/14
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestThreads {
    public static void main(String[] args) {
        MarketNews mn = new MarketNews("Market news");
        mn.start();
        Portfolio p = new Portfolio("Portfolio");
        p.start();
        System.out.println("TestThreads is finished");
    }
}
