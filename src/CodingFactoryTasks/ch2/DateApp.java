package CodingFactoryTasks.ch2;

import java.util.Scanner;

/**
 * Διαβάζει τρεις ακέραιους αριθμούς που αναπαριστούν
 * ημέρα, μήνα, έτος και εμφανίζει σε μορφή ΗΗ/ΜΜ/ΕΕ.
 * Π.χ., αν δώσουμε 5 12 2022 θα εμφανίσει 05/12/22.
 */
public class DateApp {

    public static void main(String[] args) {
        int inputYear;
        int inputMonth;
        int inputDay;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give Day: ");
        inputDay = scanner.nextInt();
        System.out.print("Give Month: ");
        inputMonth = scanner.nextInt();
        System.out.print("Give Year: ");
        inputYear = scanner.nextInt();

        System.out.printf("%02d / %02d / %04d", inputDay, inputMonth, inputYear);
    }
}
