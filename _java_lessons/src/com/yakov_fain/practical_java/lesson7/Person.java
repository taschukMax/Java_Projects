package com.yakov_fain.practical_java.lesson7;

abstract public class Person {
    private String name;
    int INCREASE_CAP = 20;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return "Person's name is " + name;
    }

    public void changeAddress(String address) {
        System.out.println("New address is " + address);
    }

    public void giveDayOff() {
        System.out.println("Giving a day off to " + name);
    }

    public void promote(int percent) {
        System.out.println("Promoting worker...");
        giveDayOff();
        increasePay(percent);

    }

    public abstract boolean increasePay(int percent);

}
