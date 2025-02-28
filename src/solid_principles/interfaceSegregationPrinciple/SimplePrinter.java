package solid_principles.interfaceSegregationPrinciple;

public class SimplePrinter implements Printer{
    @Override
    public void print(){
        System.out.println("Printing document....");
    }
}
