package SOLID_Principles.i_SingleResponsibility.violation;

public class ProductMarker {
    private String name;
    public int price;
    private String color;

    public ProductMarker(String name, int price, String color){
        this.name = name;
        this.price = price;
        this.color = color;
    }
}
