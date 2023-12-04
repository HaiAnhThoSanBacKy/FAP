package org.example.entity;

import org.example.interfaces.EducationalUnit;

public class Department implements EducationalUnit {

    private String name;
    public Department(String name) {
        this.name = name;
    }
    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
    }
}
