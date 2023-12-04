package org.example.entity.service;

import org.example.entity.Course;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.interfaces.CourseBuilderInterface;

import java.util.Date;
import java.util.List;

public class CourseBuilderService implements CourseBuilderInterface {
    private Course course;
    public CourseBuilderService() {
        this.course = new Course();
    }


    @Override
    public void buildID(int id) {
        course.setId(id);
        System.out.println("ID Course: " +id);
    }


    @Override
    public void buildName(String name) {
    course.setName(name);
        System.out.println("Course name: " +name);

    }
    @Override
    public void buildCode(String code) {
        course.setCode(code);
    }

    @Override
    public void buildSubjectCode(String subjectCode) {
        course.setSubjectCode(subjectCode);
    }

    @Override
    public void buildStartDate(Date startDate) {
    course.setStartDate(startDate);
    }

    @Override
    public void buildEndDate(Date endDate) {
    course.setEndDate(endDate);
    }

    @Override
    public void buildTeacher(String teacher) {
        course.setTeacher(new Teacher());
    }


    @Override
    public void buildStudentList(List<Student> studentList) {
        course.setStudentList(studentList);
    }




}
