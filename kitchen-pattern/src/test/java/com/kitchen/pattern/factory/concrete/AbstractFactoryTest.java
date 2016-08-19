package com.kitchen.pattern.factory.concrete;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User：lianggl
 * Date：2016/8/17
 * Time：17:36
 */
public class AbstractFactoryTest {

    @Test
    public void creator1() {
        Creator creator = new ConcreteCreator1();
        ProductA productA = creator.factoryA();
        ProductB productB = creator.factoryB();
        System.out.println(productA);
        System.out.println(productB);
    }

    @Test
    public void creator2() {
        Creator creator = new ConcreteCreator2();
        ProductA productA = creator.factoryA();
        ProductB productB = creator.factoryB();
        System.out.println(productA);
        System.out.println(productB);
    }
}
