package com.jinliang.proxy.cglib;

/**
 * JDK的动态代理通过接口进行强制转换的，生成以后的代理对象可以强制转换为接口
 * CGLIB的动态代理是通过生成一个被代理对象的字类，然后重写父类的方法，生成以后的对象可以强制转换为被代理对象
 *
 * @author jinliang 2019/01/01 20:34
 */
public class TestCglibProxy {
    public static void main(String[] args) {
        try {
            ZhangSan object = (ZhangSan) new Meipo().getInstance(ZhangSan.class);
            object.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
