package test.creational.abstractFactory;

import main.creational.abstractFactory.Client;
import main.creational.abstractFactory.DatabaseFactory;
import main.creational.abstractFactory.NetworkFactory;

public class ClientTest {

    public static void main(String[] args) {
        Client client1 = new Client(new DatabaseFactory());
        client1.communicate();

        Client client2 = new Client(new NetworkFactory());
        client2.communicate();

    }
}
