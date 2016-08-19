package com.kitchen.pattern.factory.method;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User：lianggl
 * Date：2016/8/17
 * Time：17:00
 */
public class FactoryMethodTest {

    @Test
    public void produceMail() {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }

    @Test
    public void produceSms() {
        Provider provider = new SendSmsFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
