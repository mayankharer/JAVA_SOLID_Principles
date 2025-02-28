package solid_principles.openClosedPrinciple;

public class FlatDiscount implements Discount{
    private double amount;

    public FlatDiscount(double amount){
        this.amount = amount;
    }

    @Override
    public double applyDiscount(double price){
        return price - amount;
    }
}
