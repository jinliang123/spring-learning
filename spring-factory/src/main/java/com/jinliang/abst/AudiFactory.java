package com.jinliang.abst;

import com.jinliang.Audi;
import com.jinliang.Car;
import com.jinliang.func.Factory;

/**
 * description
 *
 * @author jinliang 2019/01/02 23:01
 */
public class AudiFactory extends AbstractFactory {

    public Car getCar() {
        return new Audi();
    }
}
