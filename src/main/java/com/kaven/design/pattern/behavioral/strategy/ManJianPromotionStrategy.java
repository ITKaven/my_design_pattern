package com.kaven.design.pattern.behavioral.strategy;

public class ManJianPromotionStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("满减促销，满200减20");
    }
}
