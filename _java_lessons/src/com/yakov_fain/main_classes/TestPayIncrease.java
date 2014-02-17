package com.yakov_fain.main_classes;

import com.yakov_fain.practical_java.lesson6.Contractor;
import com.yakov_fain.practical_java.lesson6.Employee;
import com.yakov_fain.practical_java.lesson6.Person;

public class TestPayIncrease {
    public static void main(String[] args) {
        Person workers[] = new Person[3];
        workers[0] = new Employee("Maxim");
        workers[1] = new Contractor("Nadya");
        workers[2] = new Employee("Andrey");
        Employee currentEmployee;
        Contractor currentContractor;

        for (Person person : workers) {
            if (person instanceof Employee) {
                currentEmployee = (Employee) person;
                currentEmployee.increasePay(30);
            } else if (person instanceof Contractor) {
                currentContractor = (Contractor) person;
                currentContractor.increasePay(25);
            }
        }
    }
}
