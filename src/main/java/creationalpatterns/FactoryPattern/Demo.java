package creationalpatterns.FactoryPattern;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circleShape = shapeFactory.getShape("CIRCLE");

        Shape rectangleShape = shapeFactory.getShape("RECTANGLE");

        Shape squareShape = shapeFactory.getShape("SQUARE");

        circleShape.draw();
        rectangleShape.draw();
        squareShape.draw();
    }
}
