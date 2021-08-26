package com.ab.creational.singleton;

class Helper {
    private static Helper helper;
    private Helper() {} // private Constructor

    public static Helper getInstance() {
        if (helper == null) {
            helper = new Helper();
        }
        return helper;
    }
}

class Helper1 {
    private static Helper1 helper;
    private Helper1() {} // private Constructor

    public synchronized static Helper1 getInstance() { // WAY 1: to achieve Thread Safety
        if (helper == null) {
            helper = new Helper1();
        }
        return helper;
    }
}

class Helper2 {
    private static Helper2 helper;
    private Helper2() {} // private Constructor

    public static Helper2 getInstance() {
        if (helper == null) {
            synchronized (Helper2.class) { // WAY 2: to achieve Thread Safety
                if (helper == null) {
                    helper = new Helper2();
                }
            }
        }
        return helper;
    }
}

class Helper3 { // WAY 3: to achieve Thread Safety
    private volatile static Helper3 helper; // 1. Add Volatile keyword
    private static final Object mutex = new Object(); // 2. to get hold of the lock
    private Helper3() {} // private Constructor

    public static Helper3 getInstance() {
        Helper3 localRef = helper; // 3. create a localRef, reducing the access of volatile variable to just one for positive use case
        if (localRef == null) {
            synchronized (mutex) {
                if (localRef == null) {
                    helper = localRef = new Helper3();
                }
            }
        }
        return helper;
    }
}

public class ThreadSafeSingleton {
}
