package com.lgl.design.pattern.structural.abstractfactory;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
