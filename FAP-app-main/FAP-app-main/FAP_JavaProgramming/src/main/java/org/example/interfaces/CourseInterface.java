package org.example.interfaces;

import org.example.entity.Course;
import org.example.entity.Student;

import java.util.List;

public interface CourseInterface {

    public Course insert(Course s);
    public Course update(Course s);
    public  boolean delete(int id);

    public  boolean deleteByTeacherID(int id);

    public List<Course> findAll();
    public Course findById(int id);


}
