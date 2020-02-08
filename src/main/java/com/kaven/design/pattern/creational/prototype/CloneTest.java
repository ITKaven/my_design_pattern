package com.kaven.design.pattern.creational.prototype;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneObject cloneObject = new CloneObject("10");
        CloneObject newcloneObject = (CloneObject) cloneObject.clone();
//        cloneObject.setNumber("9");
        System.out.println(cloneObject);
        System.out.println(newcloneObject);
    }
}
