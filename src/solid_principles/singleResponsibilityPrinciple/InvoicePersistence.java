package solid_principles.singleResponsibilityPrinciple;

public class InvoicePersistence {
    public void saveFile(Invoice invoice,String filename){
        System.out.println("Saving invoice to file " + filename);
    }
}
