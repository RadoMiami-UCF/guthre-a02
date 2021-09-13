/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution13 {
    private static final int NUM_TO_PERCENT = 100;
    public static void main(String[] args) {
        /*
        First, take and store the principal amount from the user,
        then do the same to the rate, number of years, and number of times the interest is compounded per year,
        then calculate the amount at the end of the investment through
        (principal amount *(1 + rate/times interest is compounded)^(times interest is compounded*years))
        and report that to the user, along with the other arguments.
         */
        var in = new Scanner(System.in);
        var moneyFormat = new DecimalFormat("0.00");
        var percentageFormat = new DecimalFormat("0.0");
        moneyFormat.setRoundingMode(RoundingMode.CEILING);
        System.out.print("What is the principal amount? ");
        var principal = Double.parseDouble(in.nextLine());
        System.out.print("What is the rate? ");
        double ratePercentage = (Double.parseDouble(in.nextLine()))/NUM_TO_PERCENT;
        System.out.print("What is the number of years? ");
        var years = Integer.parseInt(in.nextLine());
        System.out.print("What is the number of times the interest ic compounded per year? ");
        var interestCompoundPerYear = Integer.parseInt(in.nextLine());
        double endOfInvestment = principal *
                (Math.pow((1 + ratePercentage/interestCompoundPerYear), (interestCompoundPerYear * years)));
        System.out.print("$" + moneyFormat.format(principal) + " invested at "
                + percentageFormat.format(ratePercentage * NUM_TO_PERCENT) + "% for " + years
                + " years compounded " + interestCompoundPerYear + " times per year is $"
                + moneyFormat.format(endOfInvestment) + ".");

    }
}
