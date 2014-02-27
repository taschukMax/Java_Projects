package com.yakov_fain.practical_java.lesson7.try_it_partII;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 2/27/14
 * Time: 11:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee implements Payable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%: " + name);
        return true;
    }
}
