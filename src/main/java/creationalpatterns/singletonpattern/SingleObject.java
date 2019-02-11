package creationalpatterns.singletonpattern;

/**
 * 最基本的单例模式
 */
public class SingleObject {
    // 创建SingleObject的一个对象
    private static SingleObject instance = new SingleObject();

    // make the constructor private, so you can't just new a object.
    private SingleObject(){}

    // get the only one instance
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("hello world.");
    }
}