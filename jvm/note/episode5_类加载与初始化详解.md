# 类加载
查看类加载jvm的参数  
-XX:+TraceClassLoading
-XX:+<option>,表示开启option
-XX:-<option>,表示关闭option
-XX：<option>=<value>,表示将option赋值value
如下是运行ClassLoadTest加入了的结果
```text
[Opened /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.Object from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.io.Serializable from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.Comparable from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.CharSequence from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.String from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.reflect.AnnotatedElement from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.reflect.GenericDeclaration from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.reflect.Type from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.Class from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.Cloneable from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.ClassLoader from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.System from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.Throwable from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.Error from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.ThreadDeath from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.Exception from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.RuntimeException from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
....
[Loaded java.io.FileOutputStream$1 from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded sun.launcher.LauncherHelper from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded sun.misc.URLClassPath$FileLoader$1 from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded com.wanxp.jvm.episode5.ClassLoadTest from file:/home/wanxp/project/learning/jvm/target/classes/]
[Loaded sun.launcher.LauncherHelper$FXHelper from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.Class$MethodArray from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.Void from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded com.wanxp.jvm.episode5.Parent1 from file:/home/wanxp/project/learning/jvm/target/classes/]
[Loaded com.wanxp.jvm.episode5.Child1 from file:/home/wanxp/project/learning/jvm/target/classes/]
parent1.static.block
parent1.str.result
[Loaded java.lang.Shutdown from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]
[Loaded java.lang.Shutdown$Lock from /home/wanxp/program/java/jdk/jdk1.8.0_161/jre/lib/rt.jar]

Process finished with exit code 0

```
