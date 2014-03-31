package com.yakov_fain.practical_java.lesson17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClassA2 {
    public static void main(String[] args) {
        Employee2 employee = new Employee2();
        employee.name = "Maksym";
        employee.lName = "Tashchuk";
        employee.salary = 120000;
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("BestEmployee2.ser"))) {
            employee.writeExternal(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The Employee object has been serialized into BestEmployee.ser");
    }
}
