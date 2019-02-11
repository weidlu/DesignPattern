package creationalpatterns.abstractfactorypattern;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (shape.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
