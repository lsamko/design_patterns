package main.structural.facade;

public class Client {

    public static void main(String[] args) {
        NetworkAccessFacade accessFacade = new NetworkAccessFacade();
        accessFacade.setCommunication();
    }
}
