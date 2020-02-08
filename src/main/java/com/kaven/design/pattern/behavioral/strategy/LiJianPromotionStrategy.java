package com.kaven.design.pattern.behavioral.strategy;

public class LiJianPromotionStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("立减促销，减10");
    }
}
