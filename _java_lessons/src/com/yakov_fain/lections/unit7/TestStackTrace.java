package com.yakov_fain.lections.unit7;

public class TestStackTrace {
    TestStackTrace() {
        divideByZero();
    }

    int divideByZero() {
        return 25 / 0;
    }

    public static void main(String[] args) {
        new TestStackTrace();

    }
}
