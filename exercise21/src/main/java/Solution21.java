/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution21 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        /*
        First, ask for the number of the month and store it.
        Then, try to find the month the number corresponds to.
        If it's found, then say the name of the month.
        Otherwise, say that the number isn't a month.
         */

        System.out.print("Please enter the number of the month: ");
        var monthInt = in.nextInt();
        safeSayMonth(monthInt);
    }

    private static void safeSayMonth(int month) {
        /*
        This code exceeds the max cyclomatic complexity. However, there isn't a good way to split the code. :(
        Furthermore, SonarLint wants me to make each valid month int its own constant. As you might imagine, that
        would be terrible!
         */
        String monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };

        String outString;
        if(!("".equals(monthName))) {
            outString = "The name of the month is " + monthName + ".";
        } else {
            outString = month + " isn't a month!";
        }

        System.out.print(outString);
    }
}
