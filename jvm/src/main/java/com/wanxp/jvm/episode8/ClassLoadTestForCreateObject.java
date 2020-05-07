package com.wanxp.jvm.episode8;

/**
 * @author wanxp
 * @version 1.0
 * @className ClassLoadTestForCreateObject
 * @date 5/4/20 11:18 AM
 * 1. 加载阶段分为 准备阶段  初始化阶段
 * 2. 准备阶段: 创建属性，给属性赋值默认值,如int类型初始值0,引用类型为null等等
 * 3. 初始化阶段:按照代码顺序进行,然后赋予属性相应的值，如int a = 1:准备阶段完成后a=0,然后a=1;
 * 4. 构造器按照所在位置进行
 **/
public class ClassLoadTestForCreateObject {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.counter1);
        System.out.println(singleton.counter2);
    }
}

class Singleton{
    //第一步 准备阶段 counter1=0
    //第四步 初始化阶段 counter1=0
    public static int counter1;
    //第二步 准备阶段 counter2=0
    //第五步 初始化阶段 counter2=0
    public static int counter2 = 0;

    //第三步 准备阶段 singleton = null
    //第六步 初始化阶段 singleton =new Singleton()
    private static Singleton singleton = new Singleton();

    //第七步 初始化 调用构造器
    //counter1=1
    //counter2=1
    private Singleton() {
        counter1++;
        counter2++;
    }

    //第八步 获取
    public static Singleton getInstance() {
        return singleton;
    }
}
