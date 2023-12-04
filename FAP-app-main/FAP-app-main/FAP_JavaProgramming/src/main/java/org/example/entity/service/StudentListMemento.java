package org.example.entity.service;
import org.example.entity.Student;
import java.util.ArrayList;

import java.util.List;
//Memento

public class StudentListMemento {

    private List<Student> students;
    public StudentListMemento(List<Student> students) {
        this.students = new ArrayList<>(students);
    }
    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }
}
