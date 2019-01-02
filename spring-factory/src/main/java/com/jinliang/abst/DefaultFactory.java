package com.jinliang.abst;

import com.jinliang.Car;

/**
 * description
 *
 * @author jinliang 2019/01/02 23:14
 */
public class DefaultFactory extends AbstractFactory {
    private AudiFactory defaultFactory = new AudiFactory();

    protected Car getCar() {
        return defaultFactory.getCar();
    }
}
