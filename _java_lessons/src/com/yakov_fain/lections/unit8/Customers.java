package com.yakov_fain.lections.unit8;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 3/31/14
 * Time: 11:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class Customers extends Data {
    private String name;

    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customers(String name) {

        this.name = name;
    }

    @Override
    void processData() {
        System.out.println(name);
    }
}
