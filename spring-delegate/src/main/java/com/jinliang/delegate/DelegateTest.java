package com.jinliang.delegate;

/**
 * IOC容器中，有一个Register的东西（为了告诉容器，在这个类被初始化的过程中，需要做很多不同的逻辑处理，需要实现多个任务执行者，
 * 分别实现各自的功能）
 *
 * @author jinliang 2019/01/14 23:43
 */
public class DelegateTest {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher(new TargetA());
        //看上去是自己在干活，其实是其他人在干活
        dispatcher.doing();
    }

}
