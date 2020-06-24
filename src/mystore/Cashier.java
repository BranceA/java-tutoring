package mystore;

// Write a class called Cashier that extends the Person class in the peoplestuff package
// Cashier should have a public instance method called total(List<DataType> parameterName)
// The method should accept a List that can contain Androids, Iphones, Windows and Apples
// The cashier should return the total of all items in the List.
// bonus: Overwrite the greetSomeoneElse method from the Person class

import peoplestuff.Person;

import java.util.List;

public class Cashier extends Person {
    public double total(List<Product> cart){
        double sum = 0;
        for(Product item : cart){
            sum += item.getPrice();
        }
        return sum;
    }
}
