package com.yakov_fain.practical_java.lesson13.bike_selling.java;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 3/18/14
 * Time: 1:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bike {
    private String name;
    private int price;

    public Bike(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike: " + name + ", price: " + price;
    }
}
