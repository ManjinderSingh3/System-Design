package SOLID_Principles.i_SingleResponsibility.solution;

public class Invoice {
    public Product product;
    public int quantity;


    public Invoice(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotal(){
       double total = (double) this.quantity * product.getPrice();
       System.out.println("Total price : "+ total);
       return total;
    }
}
