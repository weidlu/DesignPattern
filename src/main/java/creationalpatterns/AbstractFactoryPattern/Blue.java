package creationalpatterns.AbstractFactoryPattern;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("blue::fill");
    }
}