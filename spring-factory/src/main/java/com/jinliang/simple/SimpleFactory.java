package com.jinliang.simple;

import com.jinliang.Audi;
import com.jinliang.Benz;
import com.jinliang.Bmw;
import com.jinliang.Car;

/**
 * 简单工厂
 *
 * @author jinliang 2019/01/02 22:46
 */
public class SimpleFactory {
    //实现统一管理
    public Car getCar(String name){
        if("BMW".equalsIgnoreCase(name)){
            return new Bmw();
        }else if ("Benz".equalsIgnoreCase(name)){
            return new Benz();
        }else if ("Audi".equalsIgnoreCase(name)){
            return new Audi();
        }else {
            return null;
        }
    }

}
