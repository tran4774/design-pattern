package com.journaldev.design.singleton;

public class SingletonPatternTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("Foo");
        System.out.println(singleton1.value);
        Singleton singleton2 = Singleton.getInstance("Bar");
        System.out.println(singleton2.value);
    }
}
