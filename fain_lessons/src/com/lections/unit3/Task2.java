package com.lections.unit3;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 2/16/14
 * Time: 5:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Task2 {
    public static void main(String[] args) {
        int counter = 0, counter2 = 0;
        while (counter < 5) {
            System.out.print(counter++ + " ");
        }
        // prints 0 1 2 3 4
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~");
        while (counter2 < 5) {
            System.out.print(++counter2 + " ");
        }
        //prints 1 2 3 4 5
    }
}
