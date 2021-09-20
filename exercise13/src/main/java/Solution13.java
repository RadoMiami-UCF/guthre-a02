/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution13 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    private static final int NUM_TO_PERCENT = 100;

    public static void main(String[] args) {
        /*
        First, take and store the principal amount from the user,
        then do the same to the rate, number of years, and number of times the interest is compounded per year,
        then calculate the amount at the end of the investment through
        (principal amount *(1 + rate/times interest is compounded)^(times interest is compounded*years))
        and report that to the user, along with the other arguments.
         */
        var moneyFormat = new DecimalFormat("0.00");
        var percentageFormat = new DecimalFormat("0.0");
        moneyFormat.setRoundingMode(RoundingMode.CEILING);
        var principal = sayThenGetDouble("What is the principal amount? ");
        double ratePercentage = sayThenGetDouble("What is the rate? ")/NUM_TO_PERCENT;
        var years = (int) sayThenGetDouble("What is the number of years? ");
        var interestCompoundPerYear = (int)
                sayThenGetDouble("What is the number of times the interest is compounded per year? ");
        double endOfInvestment = principal *
                (Math.pow((1 + ratePercentage/interestCompoundPerYear), (interestCompoundPerYear * years)));
        System.out.print("$" + moneyFormat.format(principal) + " invested at "
                + percentageFormat.format(ratePercentage * NUM_TO_PERCENT) + "% for " + years
                + " years compounded " + interestCompoundPerYear + " times per year is $"
                + moneyFormat.format(endOfInvestment) + ".");
    }

    private static double sayThenGetDouble(String sayString) {
        System.out.print(sayString);
        return in.nextDouble();
    }
}
