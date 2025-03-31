package CodingFactoryTasks.ch5;

import java.util.Scanner;

public class StarsAppMethods {
static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice =  0;
        int num = 0;


        do {
            printMenu();
            choice = scanner.nextInt();

            System.out.print("Give number of stars: ");
            num = scanner.nextInt();

            switch (choice) {
                case 1:
                    horizontalStars(num);
                    break;
                case 2:
                    verticalStars(num);
                    break;
                case 3:
                    NxNStars(num);
                    break;
                case 4:
                    oneToNStars(num);
                    break;
                case 5:
                    nToOneStars(num);
                    break;
                case 6:
                    System.out.println("Εξοδος...");
                    break;
                default:
                    System.out.println("΅Λαθος επιλογη. Παρακαλω επιλεξτε απο το 1 εως το 6");
                    break;
            }
            System.out.println();

        } while (choice != 6);



    }

    public static void printMenu() {
        System.out.println("""
                Επιλεξτε μια απο τις παρακατω επιλογες:
                1. Εμφάνισε n αστεράκια οριζόντια
                2. Εμφάνισε n αστεράκια κάθετα
                3. Εμφάνισε n γραμμές με n αστεράκια
                4. Εμφάνισε n γραμμές με αστεράκια 1 έως n
                5. Εμφάνισε n γραμμές με αστεράκια n έως 1
                6. Έξοδος από το πρόγραμμα
                
                Δωστε αριθμο επιλογης:""");
    }

    public static void horizontalStars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }

    public static void verticalStars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("*");
        }
    }

    public static void NxNStars(int num) {
        for (int i = 0; i < num; i++) {
            horizontalStars(num);
            System.out.println();
        }
    }

    public static void oneToNStars(int num) {
        for (int i = 0; i <= num; i++) {
            horizontalStars(i);
            System.out.println();
        }
    }

    public static void nToOneStars(int num) {
        for (int i = num; i >= 0; i--) {
            horizontalStars(i);
            System.out.println();
        }
    }




}
