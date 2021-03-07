package com.lgl.design.pattern.structural.adapter.classadapter;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
