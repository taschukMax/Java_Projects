package com.yakov_fain.practical_java.lesson7.try_it;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 2/26/14
 * Time: 2:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class ForeignContractor extends Person implements Payable {

    public ForeignContractor(String name) {
        super(name);
    }

    public boolean increasePay(int percent) {
        System.out.println("I'm just foreign worker");
        return true;
    }
}
