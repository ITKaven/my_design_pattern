package com.kaven.design.pattern.creational.prototype.clone;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pig pig = new Pig("佩奇",new Date(0L));
        Pig clonePig = (Pig) pig.clone();

        System.out.println(pig);
        System.out.println(clonePig);

        clonePig.getBirthday().setTime(1000000000000L);
        System.out.println(pig);
        System.out.println(clonePig);
    }
}