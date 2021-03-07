package com.lgl.design.pattern.behavior.strategy;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class FanXianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额存放到慕课网用户的余额中");
    }
}
