package org.example.entity.service;

import org.example.interfaces.Observer;

import java.util.List;

public class StudentListObserver implements Observer {
    @Override
    public void update(List<String> repeatedStudents) {

    }
    private void displayStudents() {
        System.out.println("Updated repeated Student List:");

    }
}
