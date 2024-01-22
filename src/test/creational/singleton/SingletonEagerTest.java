package test.creational.singleton;


import main.creational.singleton.SingletonEager;

class SingletonEagerTest {

    public static void main(String[] args) {
        SingletonEager instance1 = SingletonEager.getEagerInstance();
        SingletonEager instance2 = SingletonEager.getEagerInstance();

        System.out.println("Instance1: " + instance1);
        System.out.println("Instance12: " + instance2);
    }
}