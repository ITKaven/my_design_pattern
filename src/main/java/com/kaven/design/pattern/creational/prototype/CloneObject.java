package com.kaven.design.pattern.creational.prototype;

public class CloneObject implements Cloneable{
    private String number;

    public CloneObject(String  number) {
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CloneObject{" +
                "number=" + number +
                '}';
    }
}
