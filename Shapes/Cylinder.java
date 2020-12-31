package Shapes;

public class Cylinder extends Circle{
    
    protected double height;

    public Cylinder(){
        this.height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius){
        this.height = height;
        super.radius = radius;
    }

    public Cylinder(double height, double radius, String color){
        this.height = height;
        super.radius = radius;
        super.color = color;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return(Math.PI * super.getRadius() * super.getRadius() * height);
    }

    public double getArea(){
        return(2 * (Math.PI * super.getRadius() * super.getRadius()) + 2 * (Math.PI * super.getRadius() * height));
    }

    public String toString(){
        return("A Cylinder with radius " + getRadius() + " and a volume of " + getVolume() + ", and surface area of " + getArea() + " , which is a subclass of " + super.toString() + ". Cylinder has the height of " + getHeight() + ", and the color " + getColor() + ".");
    }
}