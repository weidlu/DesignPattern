package creationalpatterns.abstractfactorypattern;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("red::fill");
    }
}
