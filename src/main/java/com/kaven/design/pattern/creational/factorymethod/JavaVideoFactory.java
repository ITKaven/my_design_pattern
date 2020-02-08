package com.kaven.design.pattern.creational.factorymethod;

public class JavaVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new JavaVideo();
    }
}
