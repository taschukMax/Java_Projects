package com.lections.unit3;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 2/16/14
 * Time: 5:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Task3 {
    public static void main(String[] args) {
        String gfriend = "Nadya";
        System.out.println(gfriend == "Nadya");
        String gfriend1 = new String("Nadjysha");
        String gfriend2 = new String("Nadjysha");
        System.out.println(gfriend1 == gfriend2);
        System.out.println(gfriend1.equals(gfriend2));
    }
}
