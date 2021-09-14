/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.util.Objects;
import java.util.Scanner;

public class Solution15 {
    protected static final String PASSWORD = "banana123";
    public static void main(String[] args) {
        /*
        First, have a known password.
        Then, ask the user for the password.
        If the password matches the known password, welcome them.
        If not, unwelcome them.
         */
        var in = new Scanner(System.in);
        System.out.print("What is the password? ");
        var inputtedPass = in.nextLine();
        if(Objects.equals(inputtedPass, PASSWORD)) {
            System.out.print("Welcome!");
        } else {
            System.out.print("I don't know you.");
        }
    }
}
