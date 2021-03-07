package com.lgl.design.pattern.structural.bridge;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
