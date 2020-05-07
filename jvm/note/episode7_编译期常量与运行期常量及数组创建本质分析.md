## 运行期常量案例  
### 常量值编译期无法确定运行期确定
* 源代码:[ClassLoadTestForFinalRunTime.java](../src/main/java/com/wanxp/jvm/episode7/ClassLoadTestForFinalRunTime.java)   
* 结果:parent3.static.block
   62a0654b-2c83-4326-965c-8382e6e68947
* 解析:
1. Parent3会初始化以及静态代码块会执行    
2. 常量在 <strong>运行期</strong> 阶段才能确认，并非在编译阶段确认，则目标类就会加载和初始化  
3. 注意点:Parent3会加载和初始化,常量是存储在Parent3中的  
* 结论:
jvm会在编译阶段将无法确认值的常量使用引用的方式引入代码，则被引用的类会被初始化
### 数组初始化
* 源代码:[ClassLoadTestForArrayInitialization.java](../src/main/java/com/wanxp/jvm/episode7/ClassLoadTestForArrayInitialization.java)   
* 结果:class [Lcom.wanxp.jvm.episode7.Parent4;
* 解析:
1. 对数组类型实例，其类型是由jvm在运行期动态生成的类型，并非是Parent4类型，而是Lcom.wanxp.jvm.episode7.Parent4
2. 动态生成的类型的父类是java.lang.Object
3. 对于数组来说,JavaDoc经常将构成数组的元数据为Component，实际上就是将数组降低一个维度后的类型

* 结论:

### 反编译
```text
Compiled from "ClassLoadTestForArrayInitialization.java"
public class com.wanxp.jvm.episode7.ClassLoadTestForArrayInitialization {
  public com.wanxp.jvm.episode7.ClassLoadTestForArrayInitialization();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: iconst_1
       1: anewarray     #2                  // class com/wanxp/jvm/episode7/Parent4
       4: astore_1
       5: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
       8: aload_1
       9: invokevirtual #4                  // Method java/lang/Object.getClass:()Ljava/lang/Class;
      12: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      15: return
}
```
解析：助记符
anewarray: 创建一个一个引用类型(类)的数组，并将数组压入栈顶,如 Integer[] a = new Integer[1];
newarray: 创建一个一个基本类型(int/float...)的数组，并将数组压入栈顶如 int[] b = new int[1];

