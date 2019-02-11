package creationalpatterns.abstractfactorypattern;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color.equalsIgnoreCase("red")){
            return new Red();
        }else if (color.equalsIgnoreCase("blue")){
            return new Blue();
        }
        return null;
    }
}
