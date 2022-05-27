package com.journaldev.design.singleton;

public class ThreadSafeSingletonTest {
    public synchronized static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadTest("Foo"));
        Thread threadBar = new Thread(new ThreadTest("Bar"));
        threadBar.start();
        threadFoo.start();
    }
}
