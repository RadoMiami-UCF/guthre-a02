package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */

public class Item {
    private final double price;
    private final int quantity;

    public Item(double inPrice, int inQuantity) {
        price = inPrice;
        quantity = inQuantity;
    }

    public double getTotal() {
        return this.price * this.quantity;
    }
}
