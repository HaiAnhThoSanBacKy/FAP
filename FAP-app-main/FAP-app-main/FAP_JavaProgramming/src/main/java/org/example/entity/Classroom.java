package org.example.entity;
import java.util.List;
//Memento

public class Classroom {
    private int id;
    private String className;
    private Teacher teacher;
    private List<Student> studentList;
   public Classroom(){
   }

    public Classroom(int id, String className, Teacher teacher, List<Student> studentList) {
        this.id = id;
        this.className = className;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
