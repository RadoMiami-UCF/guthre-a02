/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;

public class Solution15 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    /*
    Sometimes, the program decides to crash right after it's finished because of this line.
    No clue why it happens only sometimes, and why only in this program.
     */
    private static final String PASSWORD = "abc$123";

    public static void main(String[] args) {
        /*
        First, have a known password.
        Then, ask the user for the password.
        If the password matches the known password, welcome them.
        If not, unwelcome them.
         */
        var inputtedPass = sayThenGetString("What is the password? ");
        if(Objects.equals(inputtedPass, PASSWORD)) {
            System.out.print("Welcome!");
        } else {
            System.out.print("I don't know you.");
        }
    }

    private static String sayThenGetString(String sayString) {
        System.out.print(sayString);
        return in.nextLine();
    }
}
