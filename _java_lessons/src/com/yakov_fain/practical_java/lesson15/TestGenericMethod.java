package com.yakov_fain.practical_java.lesson15;

import com.yakov_fain.practical_java.lesson7.try_it.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


public class TestGenericMethod {
    public static void main(String[] args) {
        LinkedList<Employee> allEmployees = new LinkedList<>();
        Employee employee = new Employee("John");
        Employee employee2 = new Employee("Chris");
        allEmployees.add(employee);
        allEmployees.add(employee2);
        for (Employee employee1 : allEmployees) {
            System.out.println(employee1.getName());
        }
        RetiredEmployee retiredEmployee = new RetiredEmployee("Maxim");
        RetiredEmployee retiredEmployee2 = new RetiredEmployee("Maxim 2");
        ArrayList<RetiredEmployee> retiredEmployeeArrayList = new ArrayList<>();

        retiredEmployeeArrayList.add(retiredEmployee);
        retiredEmployeeArrayList.add(retiredEmployee2);

        System.out.println("\nRetired Employees  + existed in Employee\n");
        LinkedList<Employee> retired = copyIntoEmployee(retiredEmployeeArrayList);
        for (Employee newEmployee : retired) {
            allEmployees.add(newEmployee);
        }

        for (Employee data : allEmployees) {
            System.out.println(data.getName());
        }
    }

    static LinkedList<Employee> copyIntoEmployee(ArrayList<? extends Employee> data) {
        LinkedList<Employee> result = new LinkedList<>();
        for (Employee employee : data) {
            result.add(employee);
        }
        return result;
    }
}
