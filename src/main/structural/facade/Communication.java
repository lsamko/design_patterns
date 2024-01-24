package main.structural.facade;

public class Communication {

    public void send(String data) {
        System.out.println("Sending data: " + data);
    }

    public void receive() {
        System.out.println("Receiving response");
    }

}
