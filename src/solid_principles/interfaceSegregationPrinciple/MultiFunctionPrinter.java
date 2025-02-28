package solid_principles.interfaceSegregationPrinciple;

public class MultiFunctionPrinter implements Printer,Scanner{
    @Override
    public void print(){
        System.out.println("Printing document....");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document....");
    }
}
