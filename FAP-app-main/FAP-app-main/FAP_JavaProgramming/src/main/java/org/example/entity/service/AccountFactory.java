package org.example.entity.service;

import org.example.entity.Parent;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.interfaces.NotifyInterface;
//account factory method
public class AccountFactory {
    public static NotifyInterface createNotification(String type){
        if (type.equals("Student")) {
            return new Student();
        } else if (type.equals("Teacher")) {
            return new Teacher();
        }else if(type.equals("Parent")){
            return new Parent();
        }
        throw new IllegalArgumentException("Invalid product type.");
    }
}
