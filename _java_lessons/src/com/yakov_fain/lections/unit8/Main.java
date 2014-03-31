package com.yakov_fain.lections.unit8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customers customer = new Customers("Maxim");
        Customers customer2 = new Customers("Nadya");
        ArrayList<Customers> customers = new ArrayList();
        ArrayList<String> chars = new ArrayList<>();
        customers.add(customer);
        customers.add(customer2);
        processData(customers);
        chars.add("a");
        chars.add("b");
    }

    private static void processData(ArrayList<? extends Data> customers) {
        for (Data c : customers) {
            c.processData();
        }
    }
}
