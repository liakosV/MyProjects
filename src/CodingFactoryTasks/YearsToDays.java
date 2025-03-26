package CodingFactoryTasks;

import java.util.Scanner;

/**
 * Convert years (ages) to days.
 */
public class YearsToDays {

    public static void main(String[] args) {
        final int YEARS_DAYS = 365;
        int inputYears;
        int yearsToDays = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Give you age: ");
        inputYears = in.nextInt();

        yearsToDays = inputYears * YEARS_DAYS;

        System.out.printf("Your age in days is: %,d days" , yearsToDays);


    }
}
