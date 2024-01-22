package main.creational.abstractFactory;

public class DatabaseService implements Service{

    @Override
    public String runService() {
        return "Database service is running";
    }
}
