package solid_principles.liskovPrinciple;

public class Rectangle implements Shape{
    protected int width,height;

    public void setWidth(int width){this.width = width; } ;
    public void setHeight(int height){this.height = height; };

    @Override
    public int getArea(){return width*height;}
}
