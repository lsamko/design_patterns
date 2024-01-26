package main.behavioral.command;

public class OderExecuteCommand implements Command{

    int id;

    public OderExecuteCommand(int id) {
        this.id = id;
    }

    @Override
    public void execute() {

        System.out.println("Order " + id + " executed!");
    }
}
