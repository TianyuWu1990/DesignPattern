package AbstractFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else {
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
