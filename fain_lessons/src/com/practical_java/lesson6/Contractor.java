package com.practical_java.lesson6;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 2/17/14
 * Time: 10:08 AM
 * To change this template use File | Settings | File Templates.
 */
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
