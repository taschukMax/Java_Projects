package com.yakov_fain.practical_java.lesson7.try_it;

public class Contractor extends Person implements Payable {
    public Contractor(String name) {
        super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        if (percent < INCREASE_CAP) {
            System.out.println("Increasing salary by " + percent + "%. " + getName());
        } else {
            System.out.println("Sorry, we can't increase pay rate more than " + INCREASE_CAP + ". " + getName());
        }
        return true;
    }
}
