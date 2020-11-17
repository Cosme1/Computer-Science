package Shapes;

public class driver {
    public static void main(String[] args) {
        Shape rectangle1 = new Rectangle();
        Shape circle1 = new Circle();
        Shape square1 = new Square();
        System.out.println("");
        System.out.println("---------Circle----------");
        System.out.println(circle1.toString());
        System.out.println("--------Rectangle----------");
        System.out.println(rectangle1.toString());
        System.out.print("Area: ");
        System.out.println(rectangle1.getArea());
        System.out.println("---------Square----------");
        System.out.println(square1.toString());
        
        
        
    }
}
