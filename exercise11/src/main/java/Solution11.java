import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution11 {
    /*
    First, ask for the amount of euros being exchanged and store that.
    Then, ask for the exchange rate and store that.
    Then, multiply the euros by the exchange rate,
    then print the amount of USD exchanged from the exchange rate, rounded up to the nearest penny.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat usdFormat = new DecimalFormat("0.00");
        usdFormat.setRoundingMode(RoundingMode.CEILING);
        System.out.print("How many euros are you exchanging? ");
        double euroCount = Double.parseDouble(in.nextLine());
        System.out.print("What is the exchange rate? ");
        double euroToUSDExchange = Double.parseDouble(in.nextLine());
        double usdCount = euroCount * euroToUSDExchange;
        System.out.print(euroCount + " euros at an exchange rate of " + euroToUSDExchange + " is \n" + usdFormat.format(usdCount) + " U.S. dollars.");

    }
}
