package main.behavioral.memento;

public class Client {

    public static void main(String[] args) {

        Originator originator = new Originator("Initial state");
        Caretaker caretaker = new Caretaker();

        caretaker.saveState(originator.createMemento());
        System.out.println("Current state is: " + originator.state);

        saveMementosState("State 1", originator, caretaker);
        saveMementosState("State 2", originator, caretaker);

        System.out.println(" ---------");

        restoreMementosState(originator, caretaker, 1);
        restoreMementosState(originator, caretaker, 0);
        restoreMementosState(originator, caretaker, 2);

    }

    private static void saveMementosState(String state, Originator originator, Caretaker caretaker) {
        originator.state = state;
        caretaker.saveState(originator.createMemento());
        System.out.println("Current state is: " + originator.state);
    }

    private static void restoreMementosState(Originator originator, Caretaker caretaker, int index) {
        originator.restoreMemento(caretaker.restoreState(index));
        System.out.println("Current state is: " + originator.state);
    }

}
