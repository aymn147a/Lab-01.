package org.example;

import org.w3c.dom.ls.LSOutput;

public abstract class Product {
    private int id;
    private double price;
    private String name;
    private static int quantity;

    public Product(int id, double price, String name){
        this.id = id;
        this.price = price;
        this.name = name;
        quantity ++;
    }
    public void applySaleDiscount(double percentage){
        this.price = this.price - ((percentage/100) * this.price);
    }

    public final void addToShoppingCart(){
        System.out.println(this.name + " has been added to the shopping cart.");
    }

    public int getTotalQuantity(){
        return quantity;
    }

    public abstract void getSellableStatus();


    public String toString(){
        return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
                "\tPrice: SR" + this.price;
    }
}
