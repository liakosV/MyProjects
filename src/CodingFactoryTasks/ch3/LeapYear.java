package CodingFactoryTasks.ch3;

import java.util.Scanner;

/** Ελέγχει αν ένα έτος είναι δίσεκτο.
 * Δίσεκτο είναι ένα έτος αν διαιρείται με το 4
 * και είτε δε διαιρείται με το 100 ή διαιρείται με το 100 και το 400.
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        while (true) {
            System.out.println("Please insert a year to see if it is a leap year or not. (Enter 0 to exit)");
            year = scanner.nextInt();

            if (year == 0) {
                System.out.println("Thank you for using the app. \nExiting...");
                break;
            }

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("The year: " + year + " is a leap year.");
            } else {
                System.out.println("The year: " + year + " is not a leap year");
            }
        }




    }
}
