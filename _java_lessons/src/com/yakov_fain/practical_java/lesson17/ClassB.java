package com.yakov_fain.practical_java.lesson17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClassB {
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("BestEmployee.ser"))) {
            Employee bestEmpl = (Employee) inputStream.readObject();
            System.out.println(bestEmpl);
        } catch (ClassNotFoundException | IOException e) {
            e.toString();
        }
    }
}
