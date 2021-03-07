package com.lgl.design.pattern.structural.abstractfactory;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:15
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
