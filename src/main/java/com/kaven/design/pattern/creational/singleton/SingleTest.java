package com.kaven.design.pattern.creational.singleton;

public class SingleTest {
    public static void main(String[] args) {

        for (int i = 0; i < 10000000; i++) {
            Singleton singleton = Singleton.getInstance();
        }
    }
}