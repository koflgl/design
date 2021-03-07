package com.lgl.design.pattern.structural.decorator.v1;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
