package org.example.design_patterns.memento;

import java.util.Stack;

public class Caretaker {

    private final Stack<Memento> history = new Stack<>();

    public void save(Memento memento) {
        history.push(memento);
    }

    public Memento undo() {
        return history.pop();
    }

}
