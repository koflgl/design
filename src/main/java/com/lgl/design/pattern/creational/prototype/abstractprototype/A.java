package com.lgl.design.pattern.creational.prototype.abstractprototype;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
