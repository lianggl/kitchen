package com.kitchen.pattern.factory.concrete;

/**
 * Created with IntelliJ IDEA.
 * User：lianggl
 * Date：2016/8/17
 * Time：17:33
 */
public class ConcreteCreator2 implements Creator {
    @Override
    public ProductA factoryA() {
        return new ProductA2();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB2();
    }
}
