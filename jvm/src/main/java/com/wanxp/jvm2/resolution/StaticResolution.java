package com.wanxp.jvm2.resolution;

public class StaticResolution {
    static class Father {
        private void say() {}
    }
    static class Son extends Father {
        private void say() {}
        public static void  staticSay() {}
    }

    public static void main(String[] args) {
        Father father = new Son();
        Father[][][] father2 = new Son[][][]{};

        father.say();
        Son.staticSay();
    }
}
