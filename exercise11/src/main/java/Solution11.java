/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution11 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    /*
    First, ask for the amount of euros being exchanged and store that.
    Then, ask for the exchange rate and store that.
    Then, multiply the euros by the exchange rate,
    then print the amount of USD exchanged from the exchange rate, rounded up to the nearest penny.
     */
    public static void main(String[] args) {
        var usdFormat = new DecimalFormat("0.00");
        usdFormat.setRoundingMode(RoundingMode.CEILING);
        var euroCount = sayThenGetDouble("How many euros are you exchanging? ");
        var euroToUSDExchange = sayThenGetDouble("What is the exchange rate? ");
        double usdCount = euroCount * euroToUSDExchange;
        System.out.print(euroCount + " euros at an exchange rate of " + euroToUSDExchange + " is \n"
                + usdFormat.format(usdCount) + " U.S. dollars.");
    }

    private static double sayThenGetDouble(String sayString) {
        System.out.print(sayString);
        return in.nextDouble();
    }
}
