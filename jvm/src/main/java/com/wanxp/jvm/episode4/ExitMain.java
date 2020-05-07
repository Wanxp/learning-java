package com.wanxp.jvm.episode4;

/**
 * @author wanxp
 *
 * 线程退出方式
 * System.exit
 */
public class ExitMain {
    /**
     * @author wanxp
     * @date 10:29 PM 5/3/20
     * @param [args]
     * @return void
     **/
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        int level = 5;
        while (true) {
            i++;
            System.out.println("system will out in " + (level - i) + " second ");
            Thread.sleep(1000);
            if (i >= (level - 1)) {
                System.out.println("out....");
                System.exit(0);
                System.out.println("exit");
            }
        }
    }
}
