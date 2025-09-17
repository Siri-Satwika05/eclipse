package com.siri.assignment;

import com.siri.assignment.employees.*;
import com.siri.assignment.utilities.EmplyeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Siri");
        m.setEmployeeId(101);
        m.setSalary(50000);
        m.setDepartment("IT");

        developer d = new developer();
        d.setName("Prasanna");
        d.setEmployeeId(102);
        d.setSalary(40000);
        d.setProgrammingLanguage("Java");

        EmplyeeUtilities util = new EmplyeeUtilities();

        System.out.println("Manager Details:");
        util.printEmployeeDetails(m);
        System.out.println("Department: " + m.getDepartment());

        System.out.println("\nDeveloper Details:");
        util.printEmployeeDetails(d);
        System.out.println("Programming Language: " + d.getProgrammingLanguage());
    }
}
