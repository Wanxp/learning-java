package com.wanxp.jvm.episode5;

/**
 * @author wanxp
 * @version 1.0
 * @className ClassLoadTest
 * @date 5/3/20 11:09 PM
 * 对于静态的字段来说，只有直接定义了该字段的类才会被初始化
 **/
public class ClassLoadTest {
    public static void main(String[] args) {
        //该段会执行Parent1.static代码块，但不会执行Child1静态代码块
        System.out.println(Child1.str);
    }
}

class Parent1 {
    public static String str = "parent1.str.result";
    static {
        System.out.println("parent1.static.block");
    }
}

class Child1 extends Parent1 {
    static {
        System.out.println("child1.static.block");
    }
}
