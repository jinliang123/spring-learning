package com.jinliang.delegate;

/**
 * 委派者
 *
 * @author jinliang 2019/01/14 23:41
 */
public class Dispatcher implements IDelegate {
    IDelegate iDelegate;

    public Dispatcher(IDelegate iDelegate) {
        this.iDelegate = iDelegate;
    }

    /**
     * 委派者 分配任务
     */
    public void doing() {
        this.iDelegate.doing();
    }
}
