/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution22 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    private static final int NUM_COUNT = 3;

    public static void main(String[] args) {
        /*
        First, get and store three numbers.
        Then, compare them to each other.
        If they're different, then give the largest number.
         */
        var numArray = new int[NUM_COUNT];
        /*
        I can't use a loop here, as I'd need an array for all the names for items in a list.
        (e.g. first, second, third...)
        In addition, SonarLint wants me to replace all instances of 2 with a constant.
        */
        numArray[0] = sayThenGetInt("Enter the first number: ");
        numArray[1] = sayThenGetInt("Enter the second number: ");
        numArray[2] = sayThenGetInt("Enter the third number: ");

        if(!(numArray[0] == numArray[1] && numArray[1] == numArray[2])) {
            int largestNum = numArray[0];
            for(var j = 1; j < NUM_COUNT; j++) {
                if(numArray[j] > largestNum) {
                    largestNum = numArray[j];
                }
            }
            System.out.print("The largest number is " + largestNum + ".");
        }
    }

    private static int sayThenGetInt(String sayString) {
        System.out.print(sayString);
        return in.nextInt();
    }
}
