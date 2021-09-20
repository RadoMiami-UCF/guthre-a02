/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution12 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    private static final int NUM_TO_PERCENT = 100;

    public static void main(String[] args) {
        /*
        Ask for the principal amount and store it,
        then ask for the rate of interest (as percentage) and store it,
        then ask for the number of years and store it,
        then calculate end of investment as principal * (1 + rate * years),
        then send that in addition to the years and rate.
         */
        var moneyFormat = new DecimalFormat("0.00");
        var percentageFormat = new DecimalFormat("0.0");
        moneyFormat.setRoundingMode(RoundingMode.CEILING);
        var principal = sayThenGetDouble("Enter the principal: ");
        var interestRate = sayThenGetDouble("Enter the rate of interest: ") / NUM_TO_PERCENT;
        var investYears = (int) sayThenGetDouble("Enter the number of years: ");
        double investmentEndAmount = principal * (1 + (interestRate) * investYears);
        System.out.print("After " + investYears + " years at "
                + percentageFormat.format((interestRate) * NUM_TO_PERCENT) + "%, the investment will be worth $"
                + moneyFormat.format(investmentEndAmount) + ".");
    }

    private static double sayThenGetDouble(String sayString) {
        System.out.print(sayString);
        return in.nextDouble();
    }
}
