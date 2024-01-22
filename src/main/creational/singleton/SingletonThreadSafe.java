package main.creational.singleton;

public class SingletonThreadSafe {

    public static SingletonThreadSafe threadSafe;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance() {
        synchronized (SingletonThreadSafe.class) {
            if (threadSafe == null) {
                threadSafe = new SingletonThreadSafe();
            }
        }
        return threadSafe;
    }
}
