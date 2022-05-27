package com.journaldev.design.singleton;

public class ThreadSafeSingleton {
    private volatile static ThreadSafeSingleton instance;

    public String value;

    public ThreadSafeSingleton(String value) {
        this.value = value;
    }

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance(String value) {
        if (instance == null) {
            instance = new ThreadSafeSingleton(value);
        }
        return instance;
    }
}
