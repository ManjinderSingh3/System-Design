package SOLID_Principles.i_SingleResponsibility.violation;

public class ViolationDemo {

    public static void main(String[] args){
        Invoice invoice = new Invoice(new ProductMarker("Thick Marker",20,"Blue"),10);
        invoice.calculatePrice();
        invoice.printInvoice();
        invoice.saveToDB();

    }
}
