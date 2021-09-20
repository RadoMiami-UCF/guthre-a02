/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Solution14 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    public static final double WI_TAX = 0.055;

    public static void main(String[] args) {
        /*
        First, ask for and store the order amount.
        Then, ask for and store the state.
        If the state is WI, add tax. Otherwise, don't.
        If tax was added, give the order amount in dollars, then the tax, then the total.
        Otherwise, just give the total.
         */
        var moneyFormat = new DecimalFormat("0.00");
        moneyFormat.setRoundingMode(RoundingMode.CEILING);
        var orderAmount = Double.parseDouble(sayThenGetString("What is the order amount? "));
        var state = sayThenGetString("What is the state? ");
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

    private static String sayThenGetString(String sayString) {
        System.out.print(sayString);
        return in.nextLine();
    }
}
