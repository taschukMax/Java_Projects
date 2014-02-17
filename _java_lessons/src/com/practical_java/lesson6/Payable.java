package com.practical_java.lesson6;

public interface Payable {
    boolean increasePay(int percent);

    int INCREASE_CAP = 20;
}
