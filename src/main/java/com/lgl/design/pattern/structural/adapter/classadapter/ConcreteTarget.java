package com.lgl.design.pattern.structural.adapter.classadapter;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
