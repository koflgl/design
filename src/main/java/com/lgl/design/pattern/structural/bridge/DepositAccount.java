package com.lgl.design.pattern.structural.bridge;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
