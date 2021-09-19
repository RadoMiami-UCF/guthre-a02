/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution09 {
    private static final int SQR_FEET_PER_GALLON = 350;

    public static void main(String[] args) {
        /*
        Ask the user for and store the width of the ceiling,
        then do the same with the length,
        then calculate how many square feet the ceiling is,
        then divide that by the amount of gallons of paint per square feet, rounding up,
        and finally tell the user that they'll need that number of gallons to cover that many square feet.
         */
        var doubleFormat = new DecimalFormat("0.###");
        var ceilWidth = sayThenGetDouble("How wide is the ceiling in feet? ");
        var ceilLength = sayThenGetDouble("How long is the ceiling in feet? ");
        double ceilArea = ceilWidth * ceilLength;
        var paintGallons = (int) Math.ceil(ceilArea / SQR_FEET_PER_GALLON);
        System.out.print("You will need to purchase " + paintGallons + " gallons of paint to cover "
                + doubleFormat.format(ceilArea) + " square feet.");
    }

    public static double sayThenGetDouble(String sayString) {
        var in = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print(sayString);
        return in.nextDouble();
    }
}
