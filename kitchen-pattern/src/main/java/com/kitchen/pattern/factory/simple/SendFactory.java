package com.kitchen.pattern.factory.simple;

/**
 * 简单工厂模式
 * User：lianggl
 * Date：2016/8/17
 * Time：16:38
 */
public class SendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }

    public Sender produce(String type) {
        switch (type) {
            case "mail":
                return new MailSender();
            case "sms":
                return new SmsSender();
            default:
                System.out.println("输入类型不正确!");
                return null;
        }
    }
}
