import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args)
    {
        /*
        First, get the user's age.
        Then, get when they would like to retire.
        Then, find the current year.
        Then, find retirement age subtracted by current age and store it.
        Then, print retirement age subtracted by current age.
        Then, add (retirement age - current age) and current year and store it.
        Finally, tell the user the current year, then retirement year.
         */

        Scanner in = new Scanner(System.in);
        System.out.print("What is your current age? ");
        int currAge = Integer.parseInt(in.nextLine());
        System.out.print("At what age would you like to retire? ");
        int retireAge = Integer.parseInt(in.nextLine());
        int yearsTillRetirement = retireAge - currAge;
        System.out.println("You have " + yearsTillRetirement + " years left until you can retire.");
        Calendar clndr = Calendar.getInstance();
        int currYear = clndr.get(Calendar.YEAR);
        int retireYear = currYear + yearsTillRetirement;
        System.out.println("It's " + currYear + ", so you can retire in " + retireYear + ".");
    }
}
