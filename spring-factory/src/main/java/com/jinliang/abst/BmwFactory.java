package com.jinliang.abst;

import com.jinliang.Bmw;
import com.jinliang.Car;
import com.jinliang.func.Factory;

/**
 * description
 *
 * @author jinliang 2019/01/02 23:02
 */
public class BmwFactory extends AbstractFactory {

    public Car getCar() {
        return new Bmw();
    }
}
