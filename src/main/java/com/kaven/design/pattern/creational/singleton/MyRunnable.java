package com.kaven.design.pattern.creational.singleton;

public class MyRunnable implements Runnable {

    public void run() {
        Singleton singleton= Singleton.getInstance();
    }
}
