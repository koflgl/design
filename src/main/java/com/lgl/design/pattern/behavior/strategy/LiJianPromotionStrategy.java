package com.lgl.design.pattern.behavior.strategy;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}
