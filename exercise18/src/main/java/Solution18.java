/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Solution18 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    private static final DecimalFormat tempFormat = new DecimalFormat("0.#");
    private static final double TEMP_CONVERT_ADD_SUBTRACT = 32;
    private static final double TEMP_CONVERT_NUMERATOR_DENOMINATOR = 9;
    private static final double TEMP_CONVERT_DENOMINATOR_NUMERATOR = 5;

    public static void main(String[] args) {
        /*
        First, ask if the user is converting fahrenheit to celsius or the other way around and store that.
        Then, ask the temperature in the scale to be converted.
        Then, convert the temperature,
        then give the temperature in the scale to be received.
         */

        System.out.print("""
                Press C to convert from Fahrenheit to Celsius.
                Press F to convert from Celsius to Fahrenheit.
                Your choice:\s""");
        var tempToConvertTo = Character.toUpperCase(in.next().charAt(0)) == 'C';
        System.out.print("Please enter the temperature in " + returnThisIfBoolOrThat(tempToConvertTo, "Fahrenheit"
                , "Celsius") + ": ");
        var inputTemp = in.nextDouble();
        double outputTemp;
        if(tempToConvertTo) {
            outputTemp = convertFtoC(inputTemp);
        } else {
            outputTemp = convertCtoF(inputTemp);
        }

        System.out.print("The temperature in " + returnThisIfBoolOrThat(tempToConvertTo, "Celsius"
                , "Fahrenheit") + " is " + tempFormat.format(outputTemp) + ".");
    }

    private static double convertFtoC(double tempInF) {
        return (tempInF - TEMP_CONVERT_ADD_SUBTRACT)
                * (TEMP_CONVERT_DENOMINATOR_NUMERATOR / TEMP_CONVERT_NUMERATOR_DENOMINATOR);
    }

    private static double convertCtoF(double tempInC) {
        return (tempInC * (TEMP_CONVERT_NUMERATOR_DENOMINATOR / TEMP_CONVERT_DENOMINATOR_NUMERATOR))
                + TEMP_CONVERT_ADD_SUBTRACT;
    }

    private static String returnThisIfBoolOrThat (boolean bool, String sayIfBool, String sayIfNotBool) {
        if(bool) {
            return sayIfBool;
        } else {
            return sayIfNotBool;
        }
    }
}
