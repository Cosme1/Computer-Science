package Shapes;

public class Square extends Rectangle {
    Shape shape1 = new Shape();

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side);
        super.getColor();
        shape1.isFilled();
    }

    public double getSide(){
        return(super.getLength());
    }

    public void setSide(){
        
    }

    public void setWidth(){
        super.getWidth();
    }

    public void setLength(){
        super.getLength();
    }

    public String toString(){
        return("A Square with side " + getSide() + ", which is a subclass of " + super.toString());
    }
}
