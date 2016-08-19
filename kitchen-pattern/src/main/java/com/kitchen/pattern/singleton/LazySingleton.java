package com.kitchen.pattern.singleton;

/**
 * 懒汉式单例
 * User：lianggl
 * Date：2016/8/19
 * Time：14:37
 */
public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton(){}

    private static class LazyHolder {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    // 静态内部类实现线程安全
    public static LazySingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    // 线程不安全
    public static LazySingleton getUnSafeInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    // 双重检查锁定实现线程安全
    public static LazySingleton getSafeInstance() {
        if(instance == null) {
            synchronized (LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
