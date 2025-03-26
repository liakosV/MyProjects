package CodingFactoryTasks;

import java.util.Scanner;

public class FirstDigitFinder {

    public static void main(String[] args) {
        int inputNum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give an integer: ");
        inputNum = scanner.nextInt();

        int firstDigit = inputNum;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        System.out.println("The first digit of the " + inputNum + " is: " + firstDigit);
    }
}
