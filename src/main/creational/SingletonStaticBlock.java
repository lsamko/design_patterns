package main.creational;

public class SingletonStaticBlock {

    private static SingletonStaticBlock staticBlockInstance;

    static {
        staticBlockInstance = new SingletonStaticBlock();
    }

    private SingletonStaticBlock() {

    }

    public static SingletonStaticBlock getInstance() {
        return staticBlockInstance;
    }
}
