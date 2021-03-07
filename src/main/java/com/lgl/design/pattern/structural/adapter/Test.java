package com.lgl.design.pattern.structural.adapter;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
