/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kimari Guthre
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Solution20 {
    public static final double WISCONSIN_BASE_TAX = 0.05;
    public static final double DUNN_TAX = 0.004;
    public static final double EAU_CLAIRE_TAX = 0.005;
    public static final double ILLINOIS_TAX = 0.08;
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        First, ask for and get the order amount.
        Then, ask for the state.
        If the state is Wisconsin, add 5% to the tax and ask for the county.
            If the county is Eau Claire, then add 0.5% to the tax.
            If the county is Dunn, then add 0.4% to the tax.
        If the state is Illinois, then add 8% to the tax.
        Calculate the tax and the total,
        then report the tax (if there is any) and the total.
         */
        var moneyFormat = new DecimalFormat("0.00");
        moneyFormat.setRoundingMode(RoundingMode.CEILING);
        System.out.print("What is the order amount? ");
        var orderAmount = Double.parseDouble(in.nextLine());
        //Have to do in.nextLine or the next in.nextLine automatically completes with a value of "".
        System.out.print("What state do you live in? ");
        var state = in.nextLine();
        //Is it switch statement time? I think it's switch statement time.
        double tax = switch (state) {
            case "Wisconsin" -> {
                System.out.print("What county do you live in? ");
                yield (CountyTaxAdd() + WISCONSIN_BASE_TAX);
            }
            case "Illinois" -> ILLINOIS_TAX;
            default -> 0;
        };
        var outputString = "";
        if(tax > 0) {
            tax = tax * orderAmount;
            outputString = "The tax is $" + moneyFormat.format(tax) + ".\n";
        }
        var total = orderAmount + tax;
        System.out.print(outputString + "The total is $" + moneyFormat.format(total) + ".");

    }

    private static double CountyTaxAdd() {
        var county = in.nextLine();
        return switch (county) {
            case "Dunn" -> DUNN_TAX;
            case "Eau Claire" -> EAU_CLAIRE_TAX;
            default -> 0;
        };
    }
}
