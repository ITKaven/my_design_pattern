package com.kaven.design.pattern.structural.decorator;

public class BattercakeWithSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc()+" 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
