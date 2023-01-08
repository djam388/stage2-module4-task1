package com.mjc.stage2;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance = null;
    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    // Write your code here!
}
