package org.example.interfaces;

import org.example.entity.Student;

import java.util.List;

public interface StudentInterface {
    //Observer Pattern
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
    //end of Observer Pattern

    public Student insert(Student s);
    public Student update(Student s);
    public  boolean delete(int id);
    public List<Student> findAll();
    public Student findById(int id);

}
