package com.yakov_fain.lections.unit4;

public interface Payable {
    boolean increasePay(int percent);

    int INCREASE_CAP = 20;
}
