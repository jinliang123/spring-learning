package com.jinliang.func;

/**
 * description
 *
 * @author jinliang 2019/01/02 23:03
 */
public class FactoryTest {
    public static void main(String[] args) {
        //工厂方法模式
        Factory audiFactory = new AudiFactory();
        System.out.println(audiFactory.getCar());
        Factory bmwFactory = new BmwFactory();
        System.out.println(bmwFactory.getCar());

    }

}
