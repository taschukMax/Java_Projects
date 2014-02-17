package com.yakov_fain.lections.unit4;

public class Employee extends Person implements Payable {
    public Employee(String name) {
        super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%. " + getName());
        return true;
    }
}
