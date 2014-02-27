package com.yakov_fain.practical_java.lesson7.try_it_partII;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 2/27/14
 * Time: 11:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestIncreaseInterface {
    public static void main(String[] args) {
        Payable workers[] = new Payable[3];
        workers[0] = new Employee("Max");
        workers[1] = new Contractor("Maksym");
        workers[2] = new Employee("Nadya");
        for (Payable person : workers) {
            person.increasePay(30);
        }
    }
}
