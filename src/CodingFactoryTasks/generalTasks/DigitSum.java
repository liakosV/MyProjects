package CodingFactoryTasks.generalTasks;

import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {
        int input;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give an input: ");
        input = scanner.nextInt();

        while (input != 0) {
            int digit = input % 10;
            sum += digit;
            input /= 10;
        }

        System.out.println("The sum of digits of the given input is: " + sum);
    }
}
