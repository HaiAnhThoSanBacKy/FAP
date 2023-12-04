package org.example.entity.service;
import java.util.Stack;

public class ClassroomHistory {
    //Memento
    private Stack<StudentListMemento> mementos = new Stack<>();

    public void saveMemento(StudentListMemento memento) {
        mementos.push(memento);
    }

    public StudentListMemento getMemento() {
        if (!mementos.isEmpty()) {
            return mementos.pop();
        }
        return null;
    }
}
