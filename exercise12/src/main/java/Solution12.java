import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution12 {
    private static final int NUM_TO_PERCENT = 100;
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution
         *  Copyright 2021 Kimari Guthre
         */
        /*
        Ask for the principal amount and store it,
        then ask for the rate of interest (as percentage) and store it,
        then ask for the number of years and store it,
        then calculate end of investment as principal * (1 + rate * years),
        then send that in addition to the years and rate.
         */
        Scanner in = new Scanner(System.in);
        DecimalFormat moneyFormat = new DecimalFormat("0.00");
        DecimalFormat percentageFormat = new DecimalFormat("0.0");
        moneyFormat.setRoundingMode(RoundingMode.CEILING);
        System.out.print("Enter the principal: ");
        double principal = Double.parseDouble(in.nextLine());
        System.out.print("Enter the rate of interest: ");
        double interestRate = (Double.parseDouble(in.nextLine())) / NUM_TO_PERCENT;
        System.out.print("Enter the number of years: ");
        int investYears = Integer.parseInt(in.nextLine());
        double investmentEndAmount = principal * (1 + (interestRate) * investYears);
        System.out.print("After " + investYears + " years at " + percentageFormat.format((interestRate) * NUM_TO_PERCENT)
                + "%, the investment will be worth $" + moneyFormat.format(investmentEndAmount) + ".");

    }
}
