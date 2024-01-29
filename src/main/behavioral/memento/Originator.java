package main.behavioral.memento;

public class Originator {

    String state;

    public Originator(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    void restoreMemento(Memento memento) {
        state = memento.state;
    }
}