package com.yakov_fain.practical_java.lesson7.try_it_partII;

public interface Payable {
    boolean increasePay(int percent);

    int INCREASE_CAP = 20;
}
