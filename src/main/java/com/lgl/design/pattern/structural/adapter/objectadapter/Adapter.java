package com.lgl.design.pattern.structural.adapter.objectadapter;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
