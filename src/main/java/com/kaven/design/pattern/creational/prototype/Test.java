package com.kaven.design.pattern.creational.prototype;

public class Test {
    private static String[] name = {"yy","kaven","jack","jojo"};
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < name.length; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName(name[i]);
            mailTemp.setEmailAddress(name[i]+"@lkwyy.com");
            mailTemp.setContent("恭喜您，此次活动中奖了");
            MailUtil.sendMail(mailTemp);
        }
    }
}
