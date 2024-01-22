package main.creational.abstractFactory;

import java.util.logging.Logger;

public class Client {

    private Service service;
    private Response response;
    Logger logger = Logger.getLogger(getClass().getName());

    public Client(DataSourceAbstractFactory factory) {
        service = factory.createService();
        response = factory.createResponse();
    }

    public void communicate() {
        if (service != null && response != null) {
            logger.info(service.runService());
            logger.info(response.getResponse());
        }
    }
}
