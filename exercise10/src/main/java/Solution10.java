/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
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
        Scanner in = new Scanner(System.in);
        DecimalFormat priceFormat = new DecimalFormat("0.00");
        double[] priceArray = new double[ITEM_COUNT];
        int[] quantityArray = new int[ITEM_COUNT];
        for(int j = 0; j < ITEM_COUNT; j++) {
            System.out.print("Enter the price of item " + (j + 1) + ": ");
            priceArray[j] = Double.parseDouble(in.nextLine());
            System.out.print("Enter the quantity of item " + (j + 1) + ": ");
            quantityArray[j] = Integer.parseInt(in.nextLine());
        }
        double subtotal = 0;
        for(int j = 0; j < ITEM_COUNT; j++) {
            subtotal += (priceArray[j] * quantityArray[j]);
        }
        System.out.println("Subtotal: $" + priceFormat.format(subtotal));
        double tax = subtotal * TAX_RATE;
        System.out.println("Tax: $" + priceFormat.format(tax));
        double total = subtotal + tax;
        System.out.println("Total: $" + priceFormat.format(total));

    }
}
