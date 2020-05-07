package com.wanxp.jvm.episode8;

import java.util.Random;

/**
 * @author wanxp
 * @date 10:46 AM 5/4/20
 * 操作:将Parent8.class文件删除也不影响代码运行
 * 结论:当一个接口初始化时,并不要求其父类接口都完成初始化
 **/
public class ClassLoadTestForInterface {
    public static void main(String[] args) {
        System.out.println(Child8.b);
    }
}

interface Parent8 {
    Thread a = new Thread() {
        {
        System.out.println("init a");
        }
    };
}

interface Child8 extends Parent8 {
    int b = 6;
}
