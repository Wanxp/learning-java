package com.wanxp.jvm.episode7;

import java.util.UUID;

/**
 * @author wanxp
 * @version 1.0
 * @className ClassLoadTestForFinalRunTime
 * @date 5/3/20 11:32 PM
 * 常量在 <strong>运行期</strong> 阶段才能确认，并非在编译阶段确认，则目标类就会加载和初始化
 * 注意点:Parent3会加载和初始化,常量是存储在Parent3中的
 **/
public class ClassLoadTestForFinalRunTime {
    public static void main(String[] args) {
        System.out.println(Parent3.str);
    }
}

class Parent3 {
    public static final String str = UUID.randomUUID().toString();
    static {
        System.out.println("parent3.static.block");
    }
}

