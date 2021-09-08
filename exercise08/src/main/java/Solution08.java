import java.util.Scanner;

public class Solution08 {
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
        Scanner in = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = Integer.parseInt(in.nextLine());
        System.out.print("How many pizzas do you have? ");
        int pizzas = Integer.parseInt(in.nextLine());
        System.out.print("How many slices per pizza? ");
        int slicesPerPizza = Integer.parseInt(in.nextLine());
        int totalSlices = pizzas * slicesPerPizza;
        System.out.println(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)");
        System.out.print("Each person gets " + totalSlices / people + " pieces of pizza.\nThere are " + totalSlices % people + " leftover pieces.");

    }
}
