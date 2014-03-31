package com.yakov_fain.lections.unit8;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customers customer = new Customers("Maxim");
        Customers customer2 = new Customers("Nadya");
        ArrayList<Customers> customers = new ArrayList();
        customers.add(customer);
        customers.add(customer2);
        processData(customers);
        System.out.println(Arrays.toString(customers.toArray()));
    }

    private static void processData(ArrayList<? extends Data> customers) {
        for (Data c : customers) {
            c.processData();
        }
    }
}
