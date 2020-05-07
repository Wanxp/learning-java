package com.wanxp.jvm.episode6;

/**
 * @author wanxp
 * @version 1.0
 * @className ClassLoadTestForFinal
 * @date 5/3/20 11:32 PM
 * 常量在 编译阶段会被存放到调用方法的常量池里
 * 注意点:Parent2不会初始化以及静态代码块不会执行,甚至把编译后的Parent2.class删除后都不影响
 * 可以通过反编译/查看ClassLoadTestForFinal class code bytes可以得知代码中只有"parent2.str.result"字符串的引用，已经和Parent2没关系了
 **/
public class ClassLoadTestForFinal {
    public static void main(String[] args) {
        System.out.println(Parent2.str);
    }
}

class Parent2 {
    public static final String str ="parent2.str.result";
    static {
        System.out.println("parent2.static.block");
    }
}

