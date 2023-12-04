package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;

import java.util.Date;

public  class Student extends Person implements NotifyInterface {
    private int parentID;
    private String studentCode;
    private String groupCode;
    private float gpa;


    public Student(){

    }

    public Student(int id, String name){
        setId(id);
        System.out.println("Student ID: "+id);
        setName(name);
        System.out.println("Student Name: "+name);

    }

    public Student(int id, String name, String address, String phone,
                   String personId, Date birthDay, String email,
                   int parentID, String studentCode, String groupCode, float gpa) {
        super(id, name, address, phone, personId, birthDay, email);
        this.parentID = parentID;
        this.studentCode = studentCode;
        this.groupCode = groupCode;
        this.gpa = gpa;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }


    @Override
    public void notification() {
        System.out.println("Student notify");

    }
}
