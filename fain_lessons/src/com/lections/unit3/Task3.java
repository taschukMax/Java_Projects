package com.lections.unit3;

public class Task3 {
    public static void main(String[] args) {
        String gfriend = "Nadya";
        System.out.println(gfriend == "Nadya");
        String gfriend1 = new String("Nadjysha");
        String gfriend2 = new String("Nadjysha");
        System.out.println(gfriend1 == gfriend2);
        System.out.println(gfriend1.equals(gfriend2));
    }
}
