package Author;

public class Book {
    String name;
    author Author;
    double price;
    int qty = 0;

    static double DISCOUNT = 0.9;

    public Book(String n, double p, int qty1) {
        this.name = n;
        this.price = p;
        this.qty = qty1;
    }


	public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public author getAuthor(){
        return Author;
    }

    public int getQuantity(){
        return qty;
    }

    public void setPrice(double p){
        this.price = p;
    }

    public void setQuantity(int q){
        this.qty = q;
    }

    public String print(){
        return ("The book is called " + getName() + ". The price is " + getPrice() + ", but there are only " + getQuantity() + " available" + ". \nInformation about the author: ");
    }
}