package org.example.entity.service;

import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.interfaces.UpdateInfoRequest;

import java.util.ArrayList;
import java.util.List;

public class AdminService implements UpdateInfoRequest {
    private List<String> studentList = new ArrayList<>();

    public Student insert(Student s) {
        return null;
    }

    public Student update(Student s) {
        return null;
    }

    public boolean delete(int id) {
        return false;
    }

    public List<Student> findAll() {
        return null;
    }

    public Student findById(int id) {
        return null;
    }


    //adapter design pattern
    public TeacherService teacherService;
    public AdminService(TeacherService teacherService){
        this.teacherService = teacherService;
    }
    @Override
    public void updateInfoTeacher(Teacher teacher) {
        teacherService.update(teacher);
    }
    //design pattern

}
