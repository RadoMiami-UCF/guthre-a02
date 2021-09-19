package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution10 {
    private static final double TAX_RATE = 0.055;
    private static final int ITEM_COUNT = 3;
    public static void main(String[] args) {
        /*
        Ask the user for the price of an item, then store it,
        then ask the user for the quantity of that item, then store it,
        then repeat the above 2 times (maybe it's loop and array time?)
        then add the prices * quantities to get the subtotal and report that to the user,
        then multiply the subtotal by the tax rate and store that as the tax and report that to the user,
        and finally add them both together and get the total.
         */
        var subtotal = getSubtotal();
        sayStringThenDouble("Subtotal: $", subtotal);
        double tax = subtotal * TAX_RATE;
        sayStringThenDouble("Tax: $", tax);
        double total = subtotal + tax;
        sayStringThenDouble("Total: $", total);

    }

    private static double getSubtotal() {
        var itemArray = new Item[ITEM_COUNT];
        for(var j = 0; j < ITEM_COUNT; j++) {
            var tempPrice = sayThenGetDouble("Enter the price of item " + (j + 1) + ": ");
            var tempQuantity = (int) sayThenGetDouble("Enter the quantity of item " + (j + 1) + ": ");
            itemArray[j] = new Item(tempPrice, tempQuantity);
        }
        double subtotal = 0;
        for(var j = 0; j < ITEM_COUNT; j++) {
            subtotal += itemArray[j].getTotal();
        }
        return subtotal;
    }

    public static double sayThenGetDouble(String sayString) {
        var in = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print(sayString);
        return in.nextDouble();
    }

    public static void sayStringThenDouble(String sayString, double sayDouble) {
        var priceFormat = new DecimalFormat("0.00");
        System.out.println(sayString + priceFormat.format(sayDouble));
    }
}
