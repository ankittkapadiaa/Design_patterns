package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class MementoDesignPatternExample {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.set("State 1");
        caretaker.addMemento(originator.saveToMemento());
        originator.set("State 2");
        caretaker.addMemento(originator.saveToMemento());
        originator.set("State 3");
        caretaker.addMemento(originator.saveToMemento());
        originator.set("State 4");
        originator.restoreToMemento(caretaker.getMemento(2));
    }
}
