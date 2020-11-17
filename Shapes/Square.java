package Shapes;

public class Square extends Rectangle {
    public Square(){
        super(1, 1);
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side);
        super.getColor();
        //shape1.isFilled();
    }

    public double getSide(){
        return(super.getLength());
    }

    public void setSide(double side){
        setWidth(side);
    }

    public void setWidth(){
        super.getWidth();
    }

    public void setLength(){
        super.getLength();
    }

    public double getArea(){
        return(getSide() * getSide());
    }

    public double getParimeter(){
        return(getSide() * 4);
    }

    public String toString(){
        return("A Square with side " + getSide() + " and an area of " + getArea() + ", which is a subclass of " + super.toString());
    }
}
