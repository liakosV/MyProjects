package CodingFactoryTasks.ch3;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("""
                Επιλεξτε μια απο τις παρακατω επιλογες:
                1. Εισαγωγη
                2. Διαγραφη
                3. Αναζτηση
                4. Ενημερωση
                5. Εξοδος
                
                Δωστε αριθμο επιλογης:""");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Επιλεξατε Εισαγωγη.");
            } else if (choice == 2) {
                System.out.println("Επιλεξατε Διαγραφη.");
            } else if (choice == 3) {
                System.out.println("Επιλεξατε Αναζητηση.");
            } else if (choice == 4) {
                System.out.println("Επιλεξατε Ενημερωση.");
            } else if (choice == 5) {
                System.out.println("Επιλεξατε Εξοδος.");
                break;
            } else {
                System.out.println("Παρακαλω επιλεξτε μια απο τις επιλογες (1 - 5)");
            }
        }


    }
}
