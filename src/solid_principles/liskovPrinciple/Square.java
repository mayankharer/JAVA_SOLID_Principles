package solid_principles.liskovPrinciple;

public class Square implements Shape{
    private int side;

    public void setSide(int side){ this.side = side;}

    @Override
    public int getArea(){return side*side;}
}
