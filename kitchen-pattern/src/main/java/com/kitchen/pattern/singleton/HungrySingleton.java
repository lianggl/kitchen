package com.kitchen.pattern.singleton;

/**
 * 饿汉式单例
 * User：lianggl
 * Date：2016/8/19
 * Time：14:53
 */
public class HungrySingleton {

    private HungrySingleton(){}
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
