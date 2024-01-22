package main.creational;

public class SingletonBillPlugh {

    private SingletonBillPlugh() {
    }

    private static class InnerStaticClass {

        private static final SingletonBillPlugh BILL_PLUGH = new SingletonBillPlugh();
    }


    public static SingletonBillPlugh getInstance() {
        return InnerStaticClass.BILL_PLUGH;
    }
}
