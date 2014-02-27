package com.yakov_fain.practical_java.lesson7.try_it_partII;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 2/27/14
 * Time: 11:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Contractor implements Payable {
    private String name;

    public Contractor(String name) {
        this.name = name;
    }

    @Override
    public boolean increasePay(int percent) {
        if (percent < Payable.INCREASE_CAP) {
            System.out.println("Increasing hourly rate by " + percent + "%: " + name);
            return true;
        } else {
            System.out.println("Sorry, can't increase hourly rate by more than " + Payable.INCREASE_CAP + "%: " + name);
            return false;
        }
    }
}
