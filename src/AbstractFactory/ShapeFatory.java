package AbstractFactory;

public class ShapeFatory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}
