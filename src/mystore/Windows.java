package mystore;
// Write a class called Windows that extends Computer and implements the Product interface
// It should have two private instance properties
// double price
// int stock
// It should have a constructor that accepts two Strings and a boolean
// Set all properties with the parameters you define (hint: use the super constructor
// to set isLaptop and type)
// Implement all methods from the Product interface
public class Windows extends Computer implements Product {
    private double price;
    private int stock;

    public Windows(String newComputerOS, boolean newIsLaptop, String newComputerType){
        super(newIsLaptop, newComputerType);
        super.setOS(newComputerOS);
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public int getStock() {
        return this.stock;
    }

    @Override
    public void setStock(int newStock) {
        this.stock = newStock;
    }
}
