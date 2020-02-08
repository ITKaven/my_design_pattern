package com.kaven.design.pattern.behavioral.strategy;

public class NewTest {
    public static void main(String[] args) {
        String promotionKey = "MANJIAN";
        PromotionActivity promotionActivity =
                new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
