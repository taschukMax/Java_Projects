package com.yakov_fain.practical_java.lesson17;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    String lName;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lName='" + lName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
