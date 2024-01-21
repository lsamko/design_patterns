package main.creational;

public class SingletonEager {

    public static SingletonEager eager = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getEagerInstance() {
        return eager;
    }
}
