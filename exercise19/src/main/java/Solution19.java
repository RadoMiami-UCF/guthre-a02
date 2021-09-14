/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Solution19 {
    public static final double BMI_MAX_HEALTHY = 25;
    public static final double BMI_MIN_HEALTHY = 18.5;
    public static void main(String[] args) {
        /*
        First, ask for and store the user's weight and height.
        Then, use the BMI formula to calculate BMI.
        If the BMI is below/above the healthy range, tell them that they are under/overweight.
        If the BMI is in the healthy range, tell them that they are at a healthy weight.
         */
        var bmiFormat = new DecimalFormat("0.0");
        System.out.print("What is your height in inches? ");
        float height = SafeFloatGet();
        System.out.print("What is your weight in pounds? ");
        float weight = SafeFloatGet();
        double bmi = (weight / Math.pow(height, 2)) * 703;
        System.out.println("Your BMI is " + bmiFormat.format(bmi) + ".");
        if(bmi < BMI_MIN_HEALTHY || bmi > BMI_MAX_HEALTHY) {
            if(bmi < BMI_MIN_HEALTHY) {
                System.out.print("You are underweight. ");
            } else {
                System.out.print("You are overweight. ");
            }
            System.out.print("You should see your doctor.");
        } else {
            System.out.print("You are within the ideal weight range.");
        }

    }

    public static float SafeFloatGet() {
        /*Function gets a possible float. If it's an actual float, it reports the float. Otherwise, it waits for another
        possible float.*/
        var in = new Scanner(System.in);
        var gotFloat = false;
        var getFloat = 0F;
        while(!gotFloat) {
            try {
                getFloat = Float.parseFloat(in.nextLine());
                gotFloat = true;
            } catch (NumberFormatException ignored) {/*Not doing anything if there's an exception*/}
        }
        return getFloat;
    }
}
