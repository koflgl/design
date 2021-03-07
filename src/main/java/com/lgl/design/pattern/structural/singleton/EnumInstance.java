package com.lgl.design.pattern.structural.singleton;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public enum EnumInstance {
    /**
     * 枚举单例
     */
    INSTANCE{
        @Override
        protected  void printTest(){
            System.out.println("lgl Print Test");
        }
    };

    /**
     * 枚举单例
     */
    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}
