package com.yakov_fain.lections.unit11.lesson21;

import java.util.concurrent.Callable;

class PortfolioCallable implements Callable<Integer> {
    private double price;

    PortfolioCallable(double price) {
        this.price = price;
    }

    public Integer call() throws Exception {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(700);    // Sleep for 700 milliseconds
            System.out.println("You have " + (price * 504) +
                    " shares of IBM");
        }

        // Just return some number
        return 10;
    }
}