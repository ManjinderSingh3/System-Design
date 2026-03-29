package Design_Patterns.Creational.ii_Factory;

public class ShapeFactory {

    IShape getShape(String input){
        switch(input){
            case "RECTANGLE" :
                return new Rectangle();
            case "SQUARE" :
                return new Square();
            default :
                throw new IllegalArgumentException("Unknown Input");
        }
    }
}
