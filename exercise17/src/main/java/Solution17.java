/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Solution17 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    private static final double MAX_BAC_TO_DRIVE = 0.08;
    private static final double BAC_CALC_A = 5.14;
    private static final double BAC_CALC_MALE = 0.73;
    private static final double BAC_CALC_FEMALE = 0.66;
    private static final double BAC_CALC_B = 0.015;

    public static void main(String[] args) {
        /*
        First, ask the user their gender.
        Then, ask how many ounces of alcohol they've drunk.
        Then, ask their weight.
        Then, ask how long it's been since their last drink. (Record this and the previous 3 statements)
        Then, use the equation to calculate their BAC,
        then report the BAC to the user,
        then tell them if it's legal to drive.
         */
        var bacFormat = new DecimalFormat("0.######");
        boolean male = ((int) sayThenGetDouble("Enter 1 if you are male or 2 if you are female: ")) == 1;
        var alcoholOz = sayThenGetDouble("How many ounces of alcohol did you have? ");
        var weight = sayThenGetDouble("What is your weight, in pounds? ");
        var hours = sayThenGetDouble("How many hours has it been since your last drink? ");
        var bac = bacCalc(alcoholOz, weight, male, hours);
        System.out.println("\nYour BAC is " + bacFormat.format(bac));
        if(bac <= MAX_BAC_TO_DRIVE) {
            System.out.print("It is legal for you to drive.");
        } else {
            System.out.print("It is not legal for you to drive.");
        }
    }

    private static double bacCalc(double alcoholConsumed, double weight, boolean male, double hoursSinceDrink) {
        double genderBACCalc;
        if(male) {
            genderBACCalc = BAC_CALC_MALE;
        } else {
            genderBACCalc = BAC_CALC_FEMALE;
        }
        return((alcoholConsumed * BAC_CALC_A / weight * genderBACCalc)
                - BAC_CALC_B * hoursSinceDrink);
    }

    private static double sayThenGetDouble(String sayString) {
        System.out.print(sayString);
        return in.nextDouble();
    }
}
