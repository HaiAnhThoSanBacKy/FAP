package org.example.core;

import java.util.Date;

public abstract class Person {

    private int id;
    private String name;
    private String address;
    private String phone;
    private String personId;
    private Date birthDay;
    private String email;
    public Person(){

    }

    public Person(int id, String name, String address, String phone,
                  String personId, Date birthDay, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.personId = personId;
        this.birthDay = birthDay;
        this.email = email;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public String getPhone() {return phone;}

    public void setPhone(String phone) {this.phone = phone;}

    public String getPersonId() {return personId;}

    public void setPersonId(String personId) {this.personId = personId;}

    public Date getBirthDay() {return birthDay;}

    public void setBirthDay(Date birthDay) {this.birthDay = birthDay;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}
}
