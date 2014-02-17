package com.yakov_fain.practical_java.lesson5;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 2/16/14
 * Time: 5:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestTax {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Sample usage of the program: " + "java TestTax 50000 NJ 2");
            System.exit(0);
        }

        com.yakov_fain.practical_java.lesson5.Tax t = new com.yakov_fain.practical_java.lesson5.Tax();    // Creating an instance of Tax. The first part of the assignment
        t.grossIncome = Double.parseDouble(args[0]);
        t.state = args[1];
        t.dependents = Integer.parseInt(args[2]);

        double yourTax = t.calcTax(); //calculating tax

        // Printing the result
        System.out.println("Your tax is " + yourTax);
    }
}
