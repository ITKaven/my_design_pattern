package com.kaven.design.pattern.structural.bridge;

public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        //委托行为
        account.openAccount();
        return account;
    }
}
