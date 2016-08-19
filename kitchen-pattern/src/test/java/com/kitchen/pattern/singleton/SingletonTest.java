package com.kitchen.pattern.singleton;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User：lianggl
 * Date：2016/8/19
 * Time：15:00
 */
public class SingletonTest {

    private static final int THREAD_NUMBER = 1000; // 线程个数

    @Test
    public void testLazySingleton() {
        for(int i = 0; i < THREAD_NUMBER; i++) {
            new Thread(() -> {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }

    @Test
    public void testHungrySingleton() {
        for(int i = 0; i < THREAD_NUMBER; i++) {
            new Thread(() -> {
                HungrySingleton instance = HungrySingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }
}
