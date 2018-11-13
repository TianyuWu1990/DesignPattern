package AbstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFacrtory("SHAPE");
        Shape s1 = shapeFactory.getShape("Rectangle");
        s1.draw();
        AbstractFactory colorFactory = FactoryProducer.getFacrtory("COLOR");
        Color c1 = colorFactory.getColor("Red");
        c1.fill();
    }
}
