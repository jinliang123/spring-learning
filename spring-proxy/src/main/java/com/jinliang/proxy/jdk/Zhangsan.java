package com.jinliang.proxy.jdk;

/**
 * 张三 单身狗
 *
 * @author jinliang 2019/01/01 15:50
 */
public class Zhangsan implements Person {
    private String sex = "男";
    private String name = "张三";

    public void findLove() {
        System.out.println("我叫"+name+" 性别："+sex);
        System.out.println("相亲要求：女的");
        System.out.println("活的");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
