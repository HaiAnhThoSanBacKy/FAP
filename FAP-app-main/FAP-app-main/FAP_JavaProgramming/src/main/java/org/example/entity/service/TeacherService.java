package org.example.entity.service;

import org.example.entity.Teacher;
import org.example.interfaces.TeacherInterface;

import java.util.List;

public class TeacherService implements TeacherInterface {

    // Singleton - Design Pattern

    public static TeacherService instance = null;
    public static synchronized TeacherService getInstance()
    {
        if(instance == null){
            instance = new TeacherService();
        }
        return instance;
    }

    @Override
    public Teacher insert(Teacher s) {
        System.out.println("Insert teacher " + s.getName());
        return null;
    }

    @Override
    public Teacher update(Teacher s) {
        System.out.println("Updated teacher");

        return null;
    }

    @Override
    public boolean delete(int id) {
        System.out.println("Deleted teacher");

        return false;
    }

    @Override
    public List<Teacher> findAll() {
        System.out.println("Find all teacher");

        return null;
    }

    @Override
    public Teacher findById(int id) {

        System.out.println("Find by id teacher");

        return null;
    }
}
