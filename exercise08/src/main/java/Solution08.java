/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution08 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        /*
        Ask and store how many people there are,
        then the amount of pizzas,
        then the slices per pizza.
        Then calculate and store how many slices of pizza there are by multiplying the pizzas by the slices per pizza.
        Then tell how many pizzas there are, along with the number of people and slices of pizza.
        Then divide and store the amount of slices of pizza each person gets,
        Then tell how many slices each person gets,
        then store the amount of remaining slices of pizza by finding slices mod people,
        then finally tell the amount of leftover slices.
         */
        var people = sayThenGetInt("How many people? ");
        var pizzas = sayThenGetInt("How many pizzas do you have? ");
        var slicesPerPizza = sayThenGetInt("How many slices per pizza? ");
        var totalSlices = pizzas * slicesPerPizza;
        System.out.print(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)\nEach person gets "
                + totalSlices / people + " pieces of pizza.\nThere are " + totalSlices % people + " leftover pieces.");
    }

    private static int sayThenGetInt(String sayString) {
        System.out.print(sayString);
        return in.nextInt();
    }
}
