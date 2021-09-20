/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution23 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        /*
        Ask several questions.
        If the question is at a dead end, give advice.
        Otherwise, ask more questions.
         */
        if(askThenGetYNBool("Is the car silent when you turn the key? ")) {
            if(askThenGetYNBool("Are the battery terminals corroded? ")) {
                System.out.print("Clean terminals and try starting again.");
            } else {
                System.out.print("Replace cables and try again.");
            }
        } else {
            if (askThenGetYNBool("Does the car make a slicking noise? ")) {
                System.out.print("Replace the battery.");
            } else {
                if(askThenGetYNBool("Does the car crank up but fail to start? ")) {
                    System.out.print("Check spark plug connections.");
                } else {
                    startAndDie();
                }
            }
        }
    }

    private static void startAndDie() {
        if(askThenGetYNBool("Does the engine start and then die? ")) {
            if(askThenGetYNBool("Does your car have fuel injection? ")) {
                System.out.print("Get it in for service.");
            } else {
                System.out.print("Check to ensure the choke is opening and closing.");
            }
        } else {
            System.out.print("This should not be possible.");
        }
    }
    private static boolean askThenGetYNBool(String sayString) {
        System.out.print(sayString);
        return Character.toUpperCase(in.next().charAt(0)) == 'Y';
    }
}
