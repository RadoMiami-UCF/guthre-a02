/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.util.Scanner;
public class Solution16 {
    public static final int MIN_AGE_DRIVER = 16;
    public static void main(String[] args) {
        /*
        First, ask the age.
        Then, print that you're not old enough to drive if they're younger than 16,
        and print that they are old enough to drive otherwise.
         */
        var in = new Scanner(System.in);
        System.out.print("What is your age? ");
        var age = in.nextInt();
        System.out.print(age >= MIN_AGE_DRIVER ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.");

    }
}
