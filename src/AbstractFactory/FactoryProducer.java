package AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFacrtory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFatory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
