package main.behavioral.command;

public class Client {

    public static void main(String[] args) {
        CommandProcessor processor = new CommandProcessor();
        processor.addCommand(new OrderAddCommand(1,12.90 ))
            .addCommand(new OrderAddCommand(2, 18.99))
            .addCommand(new OderExecuteCommand(2))
            .addCommand(new OrderAddCommand(3, 3.95))
            .executeCommand();

    }
}
