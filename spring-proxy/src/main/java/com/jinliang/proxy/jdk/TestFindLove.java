package com.jinliang.proxy.jdk;

/**
 * 代理模式测试
 * 代理模式的原理：
 * 1.拿到被代理对象的引用，然后获取他的接口
 * 2.JDK的代理就会重新生成一个类，同时实现我们给的代理对象所实现的接口
 * 3.同时把被代理对象的引用也拿到了
 * 4.通过Invoke方法，重新动态生成一个Class字节码
 * 5.然后编译
 * @author jinliang 2019/01/01 15:58
 */
public class TestFindLove {
    public static void main(String[] args) {
        //1.直接使用对象调用
        Zhangsan zhangsan = new Zhangsan();
        zhangsan.findLove();
        //2.使用jdk动态代理模式
        try {
            Object object = new Meipo().getInstance(new Zhangsan());
            Person person = (Person) object;
            System.out.println("代理后的对象的Class是："+person.getClass());
            person.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
