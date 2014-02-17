package com.hexlet.episode_II.lection3_threads;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 2/17/14
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        ThreadPrintMessage threadPrintMessage = new ThreadPrintMessage();
        threadPrintMessage.start();
        Thread.sleep(3000);
        threadPrintMessage.stopPrint();
    }
}
