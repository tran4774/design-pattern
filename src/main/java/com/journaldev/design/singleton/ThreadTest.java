package com.journaldev.design.singleton;

public class ThreadTest implements Runnable {

    public String value;

    public ThreadTest(String value) {
        this.value = value;
    }

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance(value);
        System.out.println("Value of normal foo singleton: "
                + singleton.value + " "
                + Thread.currentThread().getName());
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance(value);
        System.out.println("Value of threadsafe foo singleton: "
                + threadSafeSingleton.value+ " "
                + Thread.currentThread().getName());
    }
}
