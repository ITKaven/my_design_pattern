package com.kaven.design.pattern.structural.decorator;

public class BattercakeWithEgg extends Battercake {

    public String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    public int cost() {
        return super.cost()+1;
    }
}
