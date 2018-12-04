package creationalpatterns.FactoryPattern;


import org.apache.commons.lang3.StringUtils;

public class ShapeFactory {
    /**
     *
     * @param shapeType 根据 shapeType 的不同 返回不同的Shape实例
     * @return
     */
    public Shape getShape(String shapeType){
        if (StringUtils.isEmpty(shapeType)){
            return null;
        }
        if ("circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if ("rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else if ("square".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
