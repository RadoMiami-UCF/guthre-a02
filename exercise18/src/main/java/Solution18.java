/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Solution18 {
    public static void main(String[] args) {
        /*
        First, ask if the user is converting fahrenheit to celsius or the other way around and store that.
        Then, ask the temperature in the scale to be converted.
        Then, convert the temperature,
        then give the temperature in the scale to be received.
         */
        var in = new Scanner(System.in);
        var tempFormat = new DecimalFormat("0.##");
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\nYour choice: ");
        var tempToConvertTo = Character.toUpperCase(in.next().charAt(0)) == 'C';
        System.out.print("Please enter the temperature in " + (tempToConvertTo ? "Fahrenheit" : "Celsius") + ": ");
        var inputTemp = in.nextDouble();
        System.out.print("The temperature in " + (tempToConvertTo ? "Celsius" : "Fahrenheit") + " is "
                + tempFormat.format(tempToConvertTo ? (inputTemp - 32) * 5 / 9 : (inputTemp * 9 / 5) + 32) + ".");
    }
}
