/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Solution17 {
    public static final double MAX_BAC_TO_DRIVE = 0.08;
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
        var in = new Scanner(System.in);
        var bacFormat = new DecimalFormat("0.######");
        System.out.print("Enter 1 if you are male or 2 if you are female: ");
        boolean male = in.nextInt() == 1;
        System.out.print("How many ounces of alcohol did you have? ");
        var alcoholOz = in.nextDouble();
        System.out.print("What is your weight, in pounds? ");
        var weight = in.nextDouble();
        System.out.print("How many hours has it been since your last drink? ");
        var hours = in.nextDouble();
        var bac = BacCalc(alcoholOz, weight, male, hours);
        System.out.println("\nYour BAC is " + bacFormat.format(bac));
        System.out.print(bac < MAX_BAC_TO_DRIVE ? "It is legal for you to drive."
                : "It is not legal for you to drive.");
    }
    private static double BacCalc(double alcoholConsumed, double weight, boolean male, double hoursSinceDrink) {
        return((alcoholConsumed * 5.14 / weight * (male ? 0.73 : 0.66)) - 0.015 * hoursSinceDrink);
    }
}
