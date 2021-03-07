package com.lgl.design.pattern.structural.bridge;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}
