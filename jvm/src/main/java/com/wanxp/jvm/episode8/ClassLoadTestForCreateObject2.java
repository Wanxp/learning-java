package com.wanxp.jvm.episode8;

/**
 * @author wanxp
 * @version 1.0
 * @className ClassLoadTestForCreateObject2
 * @date 5/4/20 11:18 AM
 **/
public class ClassLoadTestForCreateObject2 {
    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton2.counter1);
        System.out.println(singleton2.counter2);
    }
}

class Singleton2{
    //第一步 准备阶段 counter1=0
    //第四步 初始化阶段 counter1=0
    public static int counter1;


    //第二步 准备阶段 singleton = null
    //第五步 初始化阶段 singleton =new Singleton()
    private static Singleton2 singleton2 = new Singleton2();


    //第六步 初始化 调用构造器
    //counter1=1;
    //counter2=1;
    private Singleton2() {
        counter1++;
        counter2++;
    }
    //注意这里的区别
    //第三步 准备阶段 counter2=0
    //第七步 初始化阶段 counter2=0,将第六步中的counter2=1修改为counter2=0
    public static int counter2 = 0;

    public static Singleton2 getInstance() {
        return singleton2;
    }
}
