package solid_principles.singleResponsibilityPrinciple;

public class Invoice {
    private String item;
    private int quantity;
    private double price;

    public Invoice(String item, int quantity, double price){
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateTotal(){
        return quantity*price;
    }

    public String getItem() {
        return item;
    }
    public int getQuantity (){
        return quantity;
    }

    public double getPrice(){
        return price;
    }
}
