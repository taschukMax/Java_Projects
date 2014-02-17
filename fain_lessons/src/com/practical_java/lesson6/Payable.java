package com.practical_java.lesson6;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 2/17/14
 * Time: 10:04 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Payable {
    boolean increasePay(int percent);

    int INCREASE_CAP = 20;
}
