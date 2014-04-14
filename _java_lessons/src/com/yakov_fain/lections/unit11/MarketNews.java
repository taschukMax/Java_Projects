package com.yakov_fain.lections.unit11;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 4/14/14
 * Time: 5:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class MarketNews extends Thread {
    public MarketNews(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println("The stock market is improving!");
    }
}
