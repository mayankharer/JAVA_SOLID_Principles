package solid_principles.singleResponsibilityPrinciple;

public class InvoicePrinter {
    public void printInvoice(Invoice invoice){
        System.out.println("Item : " + invoice.getItem());
        System.out.println("Quantity : " + invoice.getQuantity());
        System.out.println("Total Price : " + invoice.calculateTotal());
    }
}
