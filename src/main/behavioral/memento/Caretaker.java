package main.behavioral.memento;

import java.util.ArrayList;

public class Caretaker {

    ArrayList<Memento> mementos = new ArrayList<>();

    public void saveState(Memento memento) {
        mementos.add(memento);
    }


    public Memento restoreState(int index) {
        return mementos.get(index);
    }
}
