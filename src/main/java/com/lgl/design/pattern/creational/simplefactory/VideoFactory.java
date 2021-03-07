package com.lgl.design.pattern.creational.simplefactory;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:11
 */
public class VideoFactory {
    public static final String JAVA="JAVA";
    public static final String PYTHON="python";

    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

    public Video getVideo(String type){
        if(JAVA.equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if(PYTHON.equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }
}
