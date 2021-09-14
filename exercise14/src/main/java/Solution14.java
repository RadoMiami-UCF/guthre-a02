/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Solution14 {
    public static final double WI_TAX = 0.055;
    public static void main(String[] args) {
        /*
        First, ask for and store the order amount.
        Then, ask for and store the state.
        If the state is WI, add tax. Otherwise, don't.
        If tax was added, give the order amount in dollars, then the tax, then the total.
        Otherwise, just give the total.
         */
        Scanner in = new Scanner(System.in);
        var moneyFormat = new DecimalFormat("0.00");
        moneyFormat.setRoundingMode(RoundingMode.CEILING);
        System.out.print("What is the order amount? ");
        var orderAmount = Double.parseDouble(in.nextLine());
        System.out.print("What is the state? ");
        var state = in.nextLine();
        var output = "";
        if(Objects.equals(state, "WI")) {
            var tax = orderAmount * WI_TAX;
            output = "The subtotal is $" + moneyFormat.format(orderAmount) + ".\nThe tax is $"
                    + moneyFormat.format(tax) + ".\n";
            orderAmount += tax;
        }
        output += "The total is $" + moneyFormat.format(orderAmount) + ".";
        System.out.print(output);
    }
}
