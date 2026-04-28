package SOLID_Principles.i_SingleResponsibility.violation;

public class Invoice {
    private ProductMarker productMarker;
    private int quantity;
    private int total;

    public Invoice(ProductMarker productMarker, int quantity){
        this.productMarker = productMarker;
        this.quantity = quantity;
    }

    // Responsibility 1: Calculate price (Business Logic)
    public void calculatePrice(){
        System.out.println("Calculating Price");
        this.total = this.productMarker.price * quantity;
        System.out.println("Price: "+total);
    }

    //Responsibility 2: Printing Invoice
    public void printInvoice(){
        System.out.println("Printing Invoice");
    }

    //Responsibility 3: Saving to DB
    public void saveToDB(){
        System.out.println("Saving to DB");
    }
}
