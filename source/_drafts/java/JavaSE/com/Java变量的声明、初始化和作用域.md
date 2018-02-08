 ###Java变量的声明、初始化和作用域
 1.与js的区别 ：分号是必须的，这是 Java 语句的结束符号。
 2.全局变量示例
 ```java
 public class Test {
    int a = 10;
    public static void main(String[]args) {
        Test v = new Test();
        v.print();
    }
//    方法定义时用void修饰时，表示没有返回值
    void print(){
        System.out.println("这是全局变量a=" + a);
    }
}
//局部变量全局调用报错
public class Test{
    public static void main(String[]args) {
        Test v = new Test();
        v.print();
        System.out.println("这是全局变量a=" + a);
    }
//    方法定义时用void修饰时，表示没有返回值
    void print(){
        int a = 10;
    }
}
 ```
 作为全局变量，无需初始化，系统自动给变量赋值。除了字符型数据被赋值为空，布尔型数据被赋值为 false，其他一律赋值为 0。局部变量必须要进行初始化赋值工作。
```java
public class Test {
    byte x;
    short y;
    int z;
    long a;
    float b;
    double c;
    char d;
    boolean e;
    public static void main(String[] args) {
        Test m = new Test();
        System.out.println(" 打印数据 x=" + m.x);
        System.out.println(" 打印数据 y=" + m.y);
        System.out.println(" 打印数据 z=" + m.z);
        System.out.println(" 打印数据 a=" + m.a);
        System.out.println(" 打印数据 b=" + m.b);
        System.out.println(" 打印数据 c=" + m.c);
        System.out.println(" 打印数据 d=" + m.d);
        System.out.println(" 打印数据 e=" + m.e);
    }
}
```
```
 打印数据 x=0
 打印数据 y=0
 打印数据 z=0
 打印数据 a=0
 打印数据 b=0.0
 打印数据 c=0.0
 打印数据 d= 
 打印数据 e=false
```

```java
public class Test {
    void diff(){
        int f; //error 局部变量未初始化
        System.out.println(" 打印数据 e=" + f);
    }
    public static void main(String[] args) {
        Test m = new Test();
        m.diff();
    }
}
```

3.常量
用关键字final声明。成员常量:方法内的常量；类常量：类的常量，需要用static 和 void 组合。无需再构造对象即可直接引用这个常
```java

public class var{
    public static void main(String[] args){
        var m=new var();
        final int X=20;
        System.out.println("常量 X="+X);
    }
}
//常量 X=20
```

如果要声明一个类常量，就需要使用关键字“static”和“final”的组合，例如下面的例子。
```java
///这里的 x 是类常量，所以无论是哪个对象的引用，它的值终究不变
public class var{
    static final int X=20;
    public static void main(String[] args){
        System.out.println(" 打印数据 X="+X);
    }
}
//打印数据 X=20
```