package com.jinliang.abst;

import com.jinliang.Car;

/**
 * 抽象工厂
 *
 * @author jinliang 2019/01/02 23:08
 */
public abstract class AbstractFactory {
    protected abstract Car getCar();

    //实现统一管理
    public Car getCar(String name) {
        if ("BMW".equalsIgnoreCase(name)) {
            return new BmwFactory().getCar();
        } else if ("Benz".equalsIgnoreCase(name)) {
            return new BenzFactory().getCar();
        } else if ("Audi".equalsIgnoreCase(name)) {
            return new AudiFactory().getCar();
        } else {
            return null;
        }
    }
}
