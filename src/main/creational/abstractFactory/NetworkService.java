package main.creational.abstractFactory;

public class NetworkService implements Service{

    @Override
    public String runService() {
        return "Networks Service is running";
    }
}
