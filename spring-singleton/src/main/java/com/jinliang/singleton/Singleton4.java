package com.jinliang.singleton;

/**
 * 懒汉模式 单例模式
 *
 * @author jinliang 2019/01/14 23:14
 */
public class Singleton4 {

    //1.声明一个静态内部类 private 保证不能修改 static 保证全局唯一
    private static class LazyHolder {
        //final 防止内部误操作
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    //2.将默认构造方法私有化
    private Singleton4() {
    }

    //3.提供静态方法获取实例 final 确保别人不能覆盖
    public static final Singleton4 getInstance(){
        return LazyHolder.INSTANCE;
    }

}
