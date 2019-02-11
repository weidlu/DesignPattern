package creationalpatterns.singletonpattern;

/**
 * 饿汉式 线程安全 但是容易产生垃圾对象
 */
public class Singleton3 {
    // 在类加载的同时 实利化对象 利用加载机制避免了多线程同步问题
    // 虽然说一般都是因为调用getInstance才导致的类加载，但是也不能排除其他情况导致类加载的可能性，
    // 严格来说，此方式失去了懒加载效果
    private static Singleton3 instance = new Singleton3();
    private Singleton3 (){}

    public static Singleton3 getInstance(){
        return instance;
    }

}
