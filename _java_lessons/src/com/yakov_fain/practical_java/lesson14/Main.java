package com.yakov_fain.practical_java.lesson14;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 3/31/14
 * Time: 12:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> passengersList = new LinkedList<String>();
        passengersList.add("Maxim");
        passengersList.add("Nadya");
        passengersList.add("Polina");
        ListIterator<String> iterator = passengersList.listIterator();

        System.out.println(iterator.next());
        iterator.add("VIP");
        iterator.previous();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
