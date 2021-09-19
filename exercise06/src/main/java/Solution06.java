/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.nio.charset.StandardCharsets;
import java.time.Year;
import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        /*
        First, get the user's age.
        Then, get when they would like to retire.
        Then, find the current year.
        Then, find retirement age subtracted by current age and store it.
        Then, print retirement age subtracted by current age.
        Then, add (retirement age - current age) and current year and store it.
        Finally, tell the user the current year, then retirement year.
         */


        var currAge = sayThenGetInt("What is your current age? ");
        var retireAge = sayThenGetInt("At what age would you like to retire? ");
        var yearsTillRetirement = retireAge - currAge;
        System.out.println("You have " + yearsTillRetirement + " years left until you can retire.");
        var currYear = (Year.now()).getValue();
        //I wonder if this causes a memory leak...
        var retireYear = currYear + yearsTillRetirement;
        System.out.println("It's " + currYear + ", so you can retire in " + retireYear + ".");
    }

    public static int sayThenGetInt(String sayString) {
        var in = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print(sayString);
        return in.nextInt();
    }
}
