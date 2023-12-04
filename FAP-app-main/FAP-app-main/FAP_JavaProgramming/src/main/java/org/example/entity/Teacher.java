package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;

import java.util.Date;

public class Teacher extends Person implements NotifyInterface {
    private String teacherCode;
    private int salaryLevel;
    private String maxDegree;
    private String major;
    private String taxCode;
    private String insuranceCode;
    private double salary;

    @Override
    public void notification() {
        System.out.println("Teacher notify");
    }

    public Teacher(){

    }

    public Teacher(int id, String name){
        setId(id);
        setName(name);
    }

    public Teacher(int id, String name, String address, String phone,
                   String personId, Date birthDay, String email,
                   String teacherCode, int salaryLevel, String maxDegree,
                   String major, String taxCode, String insuranceCode, double salary) {
        super(id, name, address, phone, personId, birthDay, email);
        this.teacherCode = teacherCode;
        this.salaryLevel = salaryLevel;
        this.maxDegree = maxDegree;
        this.major = major;
        this.taxCode = taxCode;
        this.insuranceCode = insuranceCode;
        this.salary = salary;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public int getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(int salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public String getMaxDegree() {
        return maxDegree;
    }

    public void setMaxDegree(String maxDegree) {
        this.maxDegree = maxDegree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getInsuranceCode() {
        return insuranceCode;
    }

    public void setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
