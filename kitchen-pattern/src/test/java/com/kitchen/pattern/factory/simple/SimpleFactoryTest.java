package com.kitchen.pattern.factory.simple;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User：lianggl
 * Date：2016/8/17
 * Time：17:00
 */
public class SimpleFactoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void produceMail() {
        logger.info("普通工厂");
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("mail");
        if(sender == null) {
            sender = SendFactory.produceMail();
        }
        sender.send();
    }

    @Test
    public void produceSms() {
        // 静态方法工厂
        Sender sender = SendFactory.produceSms();
        sender.send();
    }
}
