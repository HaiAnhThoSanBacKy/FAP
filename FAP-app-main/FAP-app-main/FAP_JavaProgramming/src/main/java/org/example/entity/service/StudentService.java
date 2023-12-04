package org.example.entity.service;
import java.util.ArrayList;

import org.example.entity.Student;
import org.example.interfaces.Observer;
import org.example.interfaces.StudentInterface;

import java.util.List;

public class StudentService implements StudentInterface {
    private List<Observer> observers = new ArrayList<>();
    private List<String> repeatedStudents = new ArrayList<>();

    public void addStudent() {
        System.out.println("Added student A to the repeated student list!");
        notifyObservers();
    }

    public void removeStudent() {
        System.out.println("Removed student B to the repeated student list!");
        notifyObservers();
    }
    @Override
    public void register(Observer observer) {
        System.out.println("Observer: Student A registered to the repeated student list!");

    }

    @Override
    public void unregister(Observer observer) {
        System.out.println("Observer: Student B unregistered to the repeated student list!");

    }

    @Override
    public void notifyObservers() {
    }

    // Singleton - Design Pattern
    public static StudentService instance = null;
    public static synchronized StudentService getInstance()
    {
        if(instance == null){
            instance = new StudentService();
        }
        return instance;
    }
    //end of Singleton
    @Override
    public Student insert(Student s) {
        return null;
    }

    @Override
    public Student update(Student s) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }
}
