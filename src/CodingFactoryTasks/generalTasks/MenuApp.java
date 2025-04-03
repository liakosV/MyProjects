package CodingFactoryTasks.generalTasks;

import java.util.Scanner;

public class MenuApp {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
//        Scanner scanner = new Scanner(System.in);

        do {
            printMenu();
            choice = scanner.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Please insert a choice between 1 - 5.");
                continue;
            }

            doOnChoice(choice);

        } while (choice != 5 );

    }

    public static void printMenu() {
        System.out.println("""
                Επιλεξτε μια απο τις παρακατω επιλογες:
                1. Εισαγωγη
                2. Διαγραφη
                3. Αναζτηση
                4. Ενημερωση
                5. Εξοδος
                Δωστε αριθμο επιλογης:""");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice) {
        if (choice == 1) {
            System.out.println("Επιλεξατε Εισαγωγη.");
        } else if (choice == 2) {
            System.out.println("Επιλεξατε Διαγραφη.");
        } else if (choice == 3) {
            System.out.println("Επιλεξατε Αναζητηση.");
        } else if (choice == 4) {
            System.out.println("Επιλεξατε Ενημερωση.");
        } else if (choice == 5) {
            System.out.println("Επιλεξατε Εξοδος. \nΕξοδος...");
        }
    }
}
