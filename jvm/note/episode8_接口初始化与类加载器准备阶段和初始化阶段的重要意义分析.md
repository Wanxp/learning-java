## 接口初始化与类加载器准备阶段和初始化阶段的重要意义分析案例  
### 接口初始化
* 源代码:[ClassLoadTestForInterface.java](../src/main/java/com/wanxp/jvm/episode8/ClassLoadTestForInterface.java)   
* 结果: 6
* 解析:
1. 将Parent8.class文件删除也不影响代码运行,当一个接口初始化时,并不要求其父类接口都完成初始化 
2. 接口属性是自带public static final 修饰的
3. 由于父类接口没有被主动或被动初始化,则a不会被初始化
* 结论:
1. 当一个接口初始化时,并不要求其父类接口都完成初始化 
2. 但直接引用父接口的时候,才会初始化
3. 接口属性是自带public static final 修饰的

### 类准备阶段与初始化->初始化1
* 源代码:[ClassLoadTestForCreateObject.java](../src/main/java/com/wanxp/jvm/episode8/ClassLoadTestForCreateObject.java)   
* 结果:   
1  
1  
* 解析:
1. 加载阶段分为 准备阶段  初始化阶段
2. 准备阶段: 创建属性，给属性赋值默认值,如int类型初始值0,引用类型为null等等
3. 初始化阶段:按照代码顺序进行,然后赋予属性相应的值，如int a = 1:准备阶段完成后a=0,然后a=1;
4. 构造器按照所在位置进行
5. 查看byte code也能看到执行的顺序
* 结论:
### 类准备阶段与初始化->初始化2
* 源代码:[ClassLoadTestForCreateObject2.java](../src/main/java/com/wanxp/jvm/episode8/ClassLoadTestForCreateObject2.java)   
* 结果: 
1
0
* 解析:
查看源代码解析结果
* 结论:
代码顺序影响的初始化顺序
