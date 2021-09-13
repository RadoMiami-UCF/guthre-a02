/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution07 {
    static final double SQ_METER_TO_SQ_FEET_FACTOR = 0.09290304;
    public static void main(String[] args) {
        /*
        Ask for and store the length and width of a room in feet.
        Then tell the user the length and width that they inputted.
        Then calculate the area in square feet, then tell it to the user
        Then convert that area into square meters by multiplying it by a constant, then tell that to the user
         */
        //Note: Also had to use decimalformat to make prints match example.
        DecimalFormat doubleFormat = new DecimalFormat("0.###");
        Scanner in = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        double roomLength = Double.parseDouble(in.nextLine());
        System.out.print("What is the width of the room in feet? ");
        double roomWidth = Double.parseDouble(in.nextLine());
        System.out.println("You entered dimensions of " + doubleFormat.format(roomLength) + " feet by "
                + doubleFormat.format(roomWidth) + " feet.");
        double areaSqFeet = roomLength * roomWidth;
        double areaSqMeters = areaSqFeet * SQ_METER_TO_SQ_FEET_FACTOR;
        System.out.print("The area is\n" + doubleFormat.format(areaSqFeet) + " square feet\n"
                + doubleFormat.format(areaSqMeters) + " square meters");

    }
}
