package Shapes;

public class Circle extends Shape {
    protected double radius;
    protected String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "blue";
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        super.filled = filled;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return(Math.PI * radius * radius);
    }

    public double getParimeter(){
        return(Math.PI * radius * 2);
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return("A Circle with radius " + getRadius() + " and an area of " + getArea() + ", which is a subclass of " + super.toString() + ".");
    }
}
