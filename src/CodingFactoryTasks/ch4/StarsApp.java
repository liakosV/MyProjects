package CodingFactoryTasks.ch4;

import java.util.Scanner;

public class StarsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int stars = 0;

        System.out.println("""
                Επιλεξτε ενα προγραμμα απο τα παρακατω:
                1. n οριζοντια αστερακια
                2. n καθετα
                3. n * n
                4. απο 1 εως n
                5. απο n εως 1
                
                Δωστε μια επιλογη: """);
        choice = scanner.nextInt();

        if (choice > 5) {
            System.out.println("Παρακαλω εισαγετε μια απο τις επιλογες (1 - 5)");
            return;
        }

        System.out.println("Δωσε αριθμο για ποσα αστερακια θες: ");
        stars = scanner.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < stars; i++) {
                    System.out.print("*");
                }
                break;
            case 2:
                for (int i = 0; i < stars; i++) {
                    System.out.println("*");
                }
                break;
            case 3:
                int h = 0;
                while (h != stars) {
                    h++;
                    for (int j = 0; j < stars; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 0; i < stars; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 5:
                for (int i = stars; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Error in choice");
                break;
        }

    }
}
