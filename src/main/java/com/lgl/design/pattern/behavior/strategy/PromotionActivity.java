package com.lgl.design.pattern.behavior.strategy;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }

}
