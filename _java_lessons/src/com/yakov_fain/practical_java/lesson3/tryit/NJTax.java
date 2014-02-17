package com.yakov_fain.practical_java.lesson3.tryit;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 2/16/14
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class NJTax extends Tax {
    public double calcTax() {
        double  stateTax=0;
        if (grossIncome < 30000) {
            stateTax=grossIncome*0.05;
        }
        else{
            stateTax= grossIncome*0.06;
        }

        return stateTax - 500;
    }
}
