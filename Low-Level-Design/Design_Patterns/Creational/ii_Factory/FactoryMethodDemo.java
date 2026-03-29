package Design_Patterns.Creational.ii_Factory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryObj = new ShapeFactory();

        IShape shapeObj = shapeFactoryObj.getShape("RECTANGLE");
        shapeObj.draw();
    }
}
