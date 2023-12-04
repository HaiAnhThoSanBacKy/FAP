package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;

public class Admin extends Person implements NotifyInterface {
    @Override
    public void notification() {
        System.out.println("Admin notify");
    }
}
