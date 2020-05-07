package com.wanxp.jvm.episode7;


import java.util.UUID;

/**
 * @author wanxp
 * @version 1.0
 * @className ClassLoadTestForArrayInitialization
 * @date 5/4/20 10:19 AM
 * 1. 对数组类型实例，其类型是由jvm在运行期动态生成的类型，并非是Parent4类型，而是Lcom.wanxp.jvm.episode7.Parent4
 * 2. 动态生成的类型的父类是java.lang.Object
 * 3. 对于数组来说,JavaDoc经常将构成数组的元数据为Component，实际上就是将数组降低一个维度后的类型
 *
 * 解析：助记符
 * anewarray: 创建一个一个引用类型(类)的数组，并将数组压入栈顶,如 Integer[] a = new Integer[1];
 * newarray: 创建一个一个基本类型(int/float...)的数组，并将数组压入栈顶如 int[] b = new int[1];
 **/
public class ClassLoadTestForArrayInitialization {
    public static void main(String[] args) {
        Parent4[] parent4s = new Parent4[1];
        System.out.println(parent4s.getClass());
    }
}
class Parent4 {
    public static final String str = UUID.randomUUID().toString();
    static {
        System.out.println("parent3.static.block");
    }
}