package test.creational.singleton;

import main.creational.singleton.SingletonLazy;

class SingletonLazyTest {

    public static void main(String[] args) {
        SingletonLazy instance1 = SingletonLazy.getInstance();
        SingletonLazy instance2 = SingletonLazy.getInstance();

        System.out.println("Instance1: " + instance1);
        System.out.println("Instance12: " + instance2);
    }
}