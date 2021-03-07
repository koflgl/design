package com.lgl.design.pattern.structural.decorator.v2;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
