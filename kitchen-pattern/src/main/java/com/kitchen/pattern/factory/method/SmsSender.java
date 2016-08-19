package com.kitchen.pattern.factory.method;

/**
 * Created with IntelliJ IDEA.
 * User：lianggl
 * Date：2016/8/17
 * Time：16:37
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
