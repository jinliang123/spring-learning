package com.jinliang.func;

import com.jinliang.Bmw;
import com.jinliang.Car;

/**
 * description
 *
 * @author jinliang 2019/01/02 23:02
 */
public class BmwFactory implements Factory {

    public Car getCar() {
        return new Bmw();
    }
}
