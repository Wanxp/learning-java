## 常量案例  
* 源代码:[ClassLoadTestForFinal.java](../src/main/java/com/wanxp/jvm/episode6/ClassLoadTestForFinal.java)   
* 结果:parent2.str.result  
* 解析:
1. Parent2不会初始化以及静态代码块不会执行  
2. 甚至把编译后的Parent2.class删除后都不影响  
3. 可以通过反编译/查看ClassLoadTestForFinal class code bytes可以得知代码中只有"parent2.str.result"字符串的引用，已经和Parent2没关系了
* 结论:
jvm会在编译阶段将能够确认值的常量编译入方法内.
## java
反编译命令
```bash
javap -c ./ClassLoadTestForFinal.class
```
返回结果
```text
Compiled from "ClassLoadTestForFinal.java"
public class com.wanxp.jvm.episode7.ClassLoadTestForFinal {
  public com.wanxp.jvm.episode7.ClassLoadTestForFinal();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #4                  // String parent2.str.result
       5: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return
}
```
解析:
ldc 表示将int,float或是String类型的常量值从常量池中推送至栈顶
bipush表示将单字节(-128 - 127)的常量值推送值栈顶
sipush表示将一个短整形常量值(-32768 - 32767)
iconst_m1 -> iconst_0 -> iconst_5 从-1到5 推送栈顶