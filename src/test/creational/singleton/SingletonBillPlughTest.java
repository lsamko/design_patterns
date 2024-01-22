package test.creational.singleton;


import main.creational.singleton.SingletonBillPlugh;

class SingletonBillPlughTest {

    public static void main(String[] args) {
        SingletonBillPlugh instance1 = SingletonBillPlugh.getInstance();
        SingletonBillPlugh instance2 = SingletonBillPlugh.getInstance();

        System.out.println("Instance1: " + instance1);
        System.out.println("Instance12: " + instance2);
    }
}