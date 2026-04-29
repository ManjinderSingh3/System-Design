package SOLID_Principles.i_SingleResponsibility.solution;

public class SingleResponsibilityDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Product("marker","blue", 20), 34);
        InvoiceDAO invoiceDAO = new InvoiceDAO();
        InvoicePrinter invoicePrinter = new InvoicePrinter();

        invoice.calculateTotal();
        invoiceDAO.saveToDB(invoice);
        invoicePrinter.printInvoice(invoice);
    }
}
