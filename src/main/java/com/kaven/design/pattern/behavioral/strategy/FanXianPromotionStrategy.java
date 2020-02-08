package com.kaven.design.pattern.behavioral.strategy;

public class FanXianPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("返现促销，满1000返50");
    }
}
