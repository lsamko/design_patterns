package main.creational.abstractFactory;

public interface DataSourceAbstractFactory {

    Service createService();

    Response createResponse();
}
