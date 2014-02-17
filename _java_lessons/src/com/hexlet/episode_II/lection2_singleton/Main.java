package com.hexlet.episode_II.lection2_singleton;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 2/17/14
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("line 1");
        testSingleton();
        System.out.println("line 2");
    }

    private static void testSingleton() {
        System.out.println(Settings.getGameName());
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Settings.getInstance();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Settings.getInstance();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Settings.getInstance();
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Settings.getInstance();
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                Settings.getInstance();
            }
        });
        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                Settings.getInstance();
            }
        });
        thread1.start();
        thread2.start();

    }
}
