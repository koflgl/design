package com.lgl.design.pattern.creational.abstractfactory;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:15
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
