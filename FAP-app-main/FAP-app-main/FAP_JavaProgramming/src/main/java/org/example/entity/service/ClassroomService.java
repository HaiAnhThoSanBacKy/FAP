package org.example.entity.service;

import org.example.entity.Student;

//momento
public class ClassroomService {
    public void addStudent(Student student) {
    }

    public StudentListMemento save() {
        System.out.println("Saved the state of Classroom!");
        return null;
    }
    public StudentListMemento delete() {
        System.out.println("deleted a student Classroom!");
        return null;
    }
    public void restore(StudentListMemento memento) {
        System.out.println("Student after restore: ---------");
    }

    public void displayStudents() {
        System.out.println("Display Students: ");
    }
}
