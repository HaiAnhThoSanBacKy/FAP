package org.example.interfaces;

import org.example.entity.Student;
import org.example.entity.Teacher;

import java.util.List;

public interface TeacherInterface {

    public Teacher insert(Teacher s);
    public Teacher update(Teacher s);
    public  boolean delete(int id);
    public List<Teacher> findAll();
    public Teacher findById(int id);
}
