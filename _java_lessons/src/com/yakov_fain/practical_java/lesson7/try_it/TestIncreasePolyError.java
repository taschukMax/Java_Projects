package com.yakov_fain.practical_java.lesson7.try_it;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 2/27/14
 * Time: 11:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestIncreasePolyError {
    public static void main(String[] args) {
        Payable workers[] = new Payable[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Max");
        workers[2] = new ForeignContractor("Ivan");

        for (Payable person : workers) {
            ((Payable) person).increasePay(30);
        }
    }
}
