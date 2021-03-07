package com.lgl.design.pattern.behavior.strategy;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
