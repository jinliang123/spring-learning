package com.jinliang.func;

import com.jinliang.Audi;
import com.jinliang.Car;

/**
 * description
 *
 * @author jinliang 2019/01/02 23:01
 */
public class AudiFactory implements Factory {

    public Car getCar() {
        return new Audi();
    }
}
