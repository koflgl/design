package com.lgl.design.pattern.structural.adapter.objectadapter;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();



    }
}
