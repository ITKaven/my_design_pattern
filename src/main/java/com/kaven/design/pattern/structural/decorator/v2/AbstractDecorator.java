package com.kaven.design.pattern.structural.decorator.v2;

//根据业务来判断抽象装饰者是否要定义成抽象类
public class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    protected int cost() {
        return this.aBattercake.cost();
    }
}
