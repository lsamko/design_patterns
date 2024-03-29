package main.structural.facade;

public class NetworkAccessFacade {

    private Communication communication = new Communication();
    private Cache cache = new Cache();
    private Interceptor interceptor = new Interceptor();
    private Convertor convertor = new Convertor();

    public void setCommunication() {
        cache.cache();
        communication.send("Authentication started");
        communication.receive();
        interceptor.intercept();
        convertor.convert();
    }

}
