/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */

import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution07 {
    private static final double SQ_METER_TO_SQ_FEET_FACTOR = 0.09290304;

    public static void main(String[] args) {
        /*
        Ask for and store the length and width of a room in feet.
        Then tell the user the length and width that they inputted.
        Then calculate the area in square feet, then tell it to the user
        Then convert that area into square meters by multiplying it by a constant, then tell that to the user.
         */
        var doubleFormat = new DecimalFormat("0.###");
        var roomLength = sayThenGetDouble("What is the length of the room in feet? ");
        var roomWidth = sayThenGetDouble("What is the width of the room in feet? ");
        System.out.println("You entered dimensions of " + doubleFormat.format(roomLength) + " feet by "
                + doubleFormat.format(roomWidth) + " feet.");
        double areaSqFeet = roomLength * roomWidth;
        double areaSqMeters = areaSqFeet * SQ_METER_TO_SQ_FEET_FACTOR;
        System.out.print("The area is\n" + doubleFormat.format(areaSqFeet) + " square feet\n"
                + doubleFormat.format(areaSqMeters) + " square meters");
    }

    public static double sayThenGetDouble(String sayString) {
        var in = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print(sayString);
        return in.nextDouble();
    }
}
