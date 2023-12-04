package org.example.interfaces;

import org.example.entity.Course;
import org.example.entity.Student;
import org.example.entity.Teacher;

import java.util.Date;
import java.util.List;

public interface CourseBuilderInterface {
   public void buildID(int id);
    public void buildCode(String code);
    public   void buildSubjectCode(String subjectCode);
    public   void buildName(String name);
    public   void buildStartDate(Date startDate);
    public   void buildEndDate(Date endDate);
    public  void buildTeacher(String teacher);
    public  void buildStudentList (List<Student> studentList);


}
