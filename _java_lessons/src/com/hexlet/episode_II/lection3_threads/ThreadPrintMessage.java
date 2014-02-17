package com.hexlet.episode_II.lection3_threads;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 2/17/14
 * Time: 5:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class ThreadPrintMessage extends Thread {
    private boolean counter = true;

    @Override
    public void run() {
        int i = 0;
        while (counter) {
            System.out.println("Hello " + i + " times");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
            i++;
        }
    }

    public void stopPrint() {
        counter = false;
    }
}
