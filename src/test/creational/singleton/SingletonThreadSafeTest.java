package test.creational.singleton;


import main.creational.singleton.SingletonThreadSafe;

class SingletonThreadSafeTest {

    public static void main(String[] args) {
        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();

        System.out.println("Instance1: " + instance1);
        System.out.println("Instance12: " + instance2);
    }
}