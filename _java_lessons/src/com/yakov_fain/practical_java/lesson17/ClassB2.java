package com.yakov_fain.practical_java.lesson17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClassB2 {
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("BestEmployee2.ser"))) {
            Employee2 employee2 = new Employee2();
            employee2.readExternal(inputStream);
            System.out.println(employee2.lName);
        } catch (ClassNotFoundException | IOException e) {
            e.toString();
        }
    }
}
