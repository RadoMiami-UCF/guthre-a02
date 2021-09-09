import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution10 {
    static final float TAX_RATE = 0.055f;
    public static void main(String[] args) {
        /*
        Ask the user for the price of an item, then store it,
        then ask the user for the quantity of that item, then store it,
        then repeat the above 2 times (maybe it's loop and array time?)
        then add the prices * quantities to get the subtotal and report that to the user,
        then multiply the subtotal by the tax rate and store that as the tax and report that to the user,
        and finally add them both together and get the total.
         */
        Scanner in = new Scanner(System.in);
        DecimalFormat priceFormat = new DecimalFormat("0.00");
        float[] priceArray = new float[3];
        int[] quantityArray = new int[3];
        for(int j = 0; j < 3; j++) {
            System.out.print("Enter the price of item " + (j + 1) + ": ");
            priceArray[j] = Float.parseFloat(in.nextLine());
            System.out.print("Enter the quantity of item " + (j + 1) + ": ");
            quantityArray[j] = Integer.parseInt(in.nextLine());
        }
        float subtotal = 0f;
        for(int j = 0; j < 3; j++) {
            subtotal += (priceArray[j] * quantityArray[j]);
        }
        System.out.println("Subtotal: $" + priceFormat.format(subtotal));
        float tax = subtotal * TAX_RATE;
        System.out.println("Tax: $" + priceFormat.format(tax));
        float total = subtotal + tax;
        System.out.println("Total: $" + priceFormat.format(total));

    }
}
