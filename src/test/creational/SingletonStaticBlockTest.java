package test.creational;

import main.creational.SingletonStaticBlock;

class SingletonStaticBlockTest {


    public static void main(String[] args) {
        SingletonStaticBlock instance1  = SingletonStaticBlock.getInstance();
        SingletonStaticBlock instance2  = SingletonStaticBlock.getInstance();

        System.out.println("Instance1: " + instance1);
        System.out.println("Instance12: " + instance2);
    }

}