package com.jinliang.func;

import com.jinliang.Car;

/**
 * 工厂方法
 *
 * @author jinliang 2019/01/02 23:00
 */
//工厂接口，就定义了所有工厂的执行标准
public interface Factory {
    Car getCar();
}
