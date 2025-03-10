package org.example;

import java.time.LocalDate;

public class FoodProduct extends Product{


    private LocalDate expirationDate;

    public FoodProduct(int id, double price, String name, LocalDate expirationDate){
        super(id, price, name);
        this.expirationDate = expirationDate;
    }
    @Override
    public void getSellableStatus(){
        System.out.println("this product is sellable");
    }

    @Override
    public String toString(){
        return super.toString() +"\t Expiration Date: " + this.expirationDate;
    }
}
