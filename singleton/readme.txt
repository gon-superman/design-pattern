
#java设计模式三（单例模式）

单例对象（Singleton）是一种常用的设计模式,单例对象能保证在一个JVM中，该对象只有一个实例存在。
这样的模式有几个好处：

1、某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。
2、省去了new操作符，降低了系统内存的使用频率，减轻GC压力。
3、有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。
（比如一个军队出现了多个司令员同时指挥，肯定会乱成一团），所以只有使用单例模式，
 才能保证核心交易服务器独立控制整个流程。
 
 单例模式误区
 
1、静态变量方式在JVM启动时就创建了对象，浪费资源
public class Singleton {
 
 	private static Singleton instance = new Singleton(); 
  
    private Singleton() { 
    }  
  
    public static Singleton getInstance() {  
        return instance;  
    } 
}
 
2、 延迟加载对象，但非线程安全
public class Singleton {
 
 	private static Singleton instance = null;  
  
    private Singleton() {  
    }  
  
    public static Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }
}
 
总结：使用示例中静态内部类的方式创建对象，保证线程安全又延迟加载。

为什么静态内部类能达到这种效果呢？
答：JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
 
 
  	  
 