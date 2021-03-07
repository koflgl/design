package com.lgl.design.pattern.structural.facade;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
