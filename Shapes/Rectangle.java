package Shapes;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return(getWidth() * getLength());
    }

    public double getParimeter(){
        return(getWidth() * 2 + getLength() * 2);
    }

    public String toString(){
        return("A Rectangle with width " + getWidth() + " and length " + getLength() + ", which is a subclass of " + super.toString());
    }
}
