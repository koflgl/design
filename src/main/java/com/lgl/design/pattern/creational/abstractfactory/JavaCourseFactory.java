package com.lgl.design.pattern.creational.abstractfactory;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return null;
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
