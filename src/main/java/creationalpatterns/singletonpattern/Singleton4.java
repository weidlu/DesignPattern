package creationalpatterns.singletonpattern;

/**
 * 双重校验锁 懒加载&&线程安全
 */
public class Singleton4 {
    private volatile static Singleton4 singleton4;
    private Singleton4(){}
    public static Singleton4 getSingleton4(){
        // 相比较于直接加锁 双重锁保证了 只有在需要实例化的对象为null的时候才去获得锁
        // 而普通模式每次都会先拿到锁再去判断 是否为null
        // 双重判断节约了性能
        if (singleton4 == null){
            synchronized (Singleton4.class){
                if (singleton4 == null){
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
