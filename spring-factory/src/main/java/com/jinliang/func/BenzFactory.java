package com.jinliang.func;

import com.jinliang.Benz;
import com.jinliang.Car;

/**
 * description
 *
 * @author jinliang 2019/01/02 23:02
 */
public class BenzFactory implements Factory {

    public Car getCar() {
        return new Benz();
    }
}
