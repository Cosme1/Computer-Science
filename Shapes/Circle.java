package Shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){

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

    public String toString(){
        return("A Circle with radius " + getRadius() + " and an area of " + getArea() + ", which is a subclass of " + super.toString());
    }
}
