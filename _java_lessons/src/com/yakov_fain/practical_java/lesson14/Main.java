package com.yakov_fain.practical_java.lesson14;

import java.util.LinkedList;
import java.util.ListIterator;

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
