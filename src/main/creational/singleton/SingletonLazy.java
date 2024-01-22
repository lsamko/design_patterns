package main.creational;

public class SingletonLazy {

    public static SingletonLazy lazy;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {

        if (lazy == null) {
            lazy = new SingletonLazy();
        }
        return lazy;
    }
}
