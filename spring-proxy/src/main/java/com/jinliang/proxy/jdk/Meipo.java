package com.jinliang.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用JDK动态代理
 *
 * @author jinliang 2019/01/01 16:01
 */
public class Meipo implements InvocationHandler {

    private Person target;


    //获取被代理的对象
    public Object getInstance(Person target) throws Exception{
        this.target = target;
        Class clazz = target.getClass();
        System.out.println("被代理对象的class是:"+clazz);
        //ClassLoader loader
        //Class<?>[] interfaces,
        //InvocationHandler h
        return  Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始代理");
//        this.target.findLove();
        method.invoke(this.target,args);
        System.out.println("代理结束");
        return null;
    }
}
