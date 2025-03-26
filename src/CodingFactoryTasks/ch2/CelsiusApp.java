package CodingFactoryTasks.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει βαθμούς Fahrenheit σε βαθμούς
 * Κελσίου σε τιμές που δίνει ο χρήστης από
 * την κονσόλα (stdin).
 */
public class CelsiusApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fahrenheit;
        float celsius = 0;

        System.out.println("Give an fahrenheit temperature: ");
        fahrenheit = scanner.nextInt();

        celsius = (float) (fahrenheit - 32) * 5 / 9;

        System.out.println("The given fahrenheit: " + fahrenheit + ". In celsius is : " + celsius);
    }
}
