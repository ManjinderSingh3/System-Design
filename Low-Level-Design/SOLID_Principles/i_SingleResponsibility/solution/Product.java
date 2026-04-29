package SOLID_Principles.i_SingleResponsibility.solution;

public class Product {
    private String name;
    private String color;
    private int price;

    public Product(String name, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
