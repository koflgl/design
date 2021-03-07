package com.lgl.design.pattern.creational.prototype.abstractprototype;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class B extends A {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.clone();
    }
}
