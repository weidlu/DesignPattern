package creationalpatterns.SingletonPattern;

public class Demo {
    public static void main(String[] args){
        // illegal
        // SingleObject object = new SingleObject();

        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
