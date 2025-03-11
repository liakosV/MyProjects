package bigBook.tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bagels {

    public static void main(String[] args) {

        while (true) {
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            String guess = "";
            int tries = 0;
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            System.out.println();
            System.out.println("Welcome to the game of bagels! \nI am thinking of a 3-digit number. Try to guess what it is");
            System.out.println("Here are some clues:");
            System.out.println("""
                    When i say:    That means:
                    Pico           One digit is correct but in the wrong position
                    Fermi          One digit is correct and in the right position
                    Bagels         No digit is correct.""");



            while (num1 == num2 || num1 == num3 || num2 == num3 ) {
                num1 = random.nextInt(10);
                num2 = random.nextInt(10);
                num3 = random.nextInt(10);

            }




            System.out.println("I have thought a number.");
            String result = num1 + String.valueOf(num2) + num3;
            System.out.println("Try to guess it in 10 tries.");


            while (true) {
                tries++;
                System.out.println("You have " + tries + "/10 tries left.");
                if (tries == 10) {
                    System.out.println("you lost!");
                    break;
                }

                if (result.equals(guess) ) {
                    System.out.println("Congratulations! \nYou have found the secret number!");
                    break;
                }

                System.out.println("Give a 3-digit number: ");
                guess = scanner.next();


                int firstDigit = Integer.parseInt(guess.substring(0, 1));
                int secondDigit = Integer.parseInt(guess.substring(1, 2));
                int thirdDigit = Integer.parseInt(guess.substring(2, 3));
                int a1 = 0;
                int a2 = 0;
                int a3 = 0;

                if (firstDigit == num1) {
                    System.out.print("Fermi ");
                    a1 = 1;
                } else if (firstDigit == num2 || firstDigit == num3) {
                    System.out.print("Pico ");
                    a1 = 2;
                }
                if (secondDigit == num2) {
                    System.out.print("Fermi ");
                    a2 = 1;
                } else if (secondDigit == num1 || secondDigit == num3) {
                    System.out.print("Pico ");
                    a2 = 2;
                }
                if (thirdDigit == num3) {
                    System.out.print("Fermi ");
                    a3 = 1;
                } else if (thirdDigit == num2 || thirdDigit == num1) {
                    System.out.print("Pico ");
                    a3 = 2;
                }

                if (a1 == 0 && a2 == 0 && a3 == 0) {
                    System.out.print("Bagels");
                }

                System.out.println();



            }
            System.out.println("Do you want to play again? (Y/N)");
            String replay = scanner.next();
            if (replay.matches("(?i)y|yes")) {

            } else {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}
