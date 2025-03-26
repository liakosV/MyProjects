package CodingFactoryTasks;

import java.util.Scanner;

public class EuroUsdConverter {

    public static void main(String[] args) {
        int euro = 0;
        int usd = 0;
        int cents = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give an amount in EURO to be converted in USD: ");
        euro = scanner.nextInt();

        usd = ((euro * 99) / 100);
        cents = usd % 100;

        System.out.println("The amount in USD is: $" + usd + "," + cents);

    }



}
