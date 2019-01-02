package com.jinliang.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 原理：字节码重组
 *
 * @author jinliang 2019/01/01 16:45
 */
public class Meipo implements MethodInterceptor {

    public Object getInstance(Class clazz) throws Exception{
        Enhancer enhancer = new Enhancer();
        //设置父类  告诉cglib生成的字类需要继承哪个类
        enhancer.setSuperclass(clazz);
        //设置回调方法
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理开始");
        //cglib new出来的对象，是被代理对象的子类（继承了我们自己写的那个类）
        //OOP 在new字类之前，实际上默认调用了我们supper()的方法
        //new了字类的同时，必须先new出父类，这就相当于是间接持有了我们父类的引用
        //我们改变了字类的某些属性，是可以间接的操作父类的属性的
        methodProxy.invokeSuper(object,args);
        System.out.println("结束代理");
        return null;
    }
}
