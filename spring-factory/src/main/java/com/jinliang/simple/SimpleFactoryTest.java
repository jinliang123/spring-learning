package com.jinliang.simple;

import com.jinliang.Car;
import com.jinliang.simple.SimpleFactory;

/**
 * description
 *
 * @author jinliang 2019/01/02 22:47
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //消费者
        Car car = new SimpleFactory().getCar("BMW");
        System.out.println(car.getName());
    }

}
