package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;

public class Parent extends Person implements NotifyInterface {
public Parent(){

}

    @Override
    public void notification() {
        System.out.println("Parent notify");

    }
}
