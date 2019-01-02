package com.jinliang.abst;

/**
 *
 * @author jinliang 2019/01/02 23:13
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        DefaultFactory defaultFactory = new DefaultFactory();
        System.out.println(defaultFactory.getCar("BMW"));
    }

}
