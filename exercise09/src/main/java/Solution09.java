import java.util.Scanner;

public class Solution09 {
    static final int SQR_FEET_PER_GALLON = 350;
    public static void main(String[] args) {
        /*
        Ask the user for and store the width of the ceiling,
        then do the same with the length,
        then calculate how many square feet the ceiling is,
        then divide that by the amount of gallons of paint per square feet, rounding up,
        and finally tell the user that they'll need that number of gallons to cover that many square feet.
         */
        Scanner in = new Scanner(System.in);
        System.out.print("How wide is the ceiling in feet? ");
        int ceilWidth = Integer.parseInt(in.nextLine());
        System.out.print("How long is the ceiling in feet? ");
        int ceilLength = Integer.parseInt(in.nextLine());
        int ceilArea = ceilWidth * ceilLength;
        int paintGallons = (int) Math.ceil(ceilArea * 1f / SQR_FEET_PER_GALLON);
        System.out.print("You will need to purchase " + paintGallons + " gallons of paint to cover " + ceilArea + " square feet.");

    }
}
