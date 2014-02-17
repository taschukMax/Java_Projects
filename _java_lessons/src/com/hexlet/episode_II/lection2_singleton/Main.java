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
        System.out.println(Settings.getInstance());
    }

}
