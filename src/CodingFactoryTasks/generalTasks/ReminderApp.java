package CodingFactoryTasks.generalTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReminderApp {
    public static Thread thread = new Thread();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("""
                Welcome to the Reminder App.
                In this app you insert a time
                and the timer starts to count down.
                """);

        while (true) {
            int hour = 0;
            int min = 0;
            int sec = 0;



            for (int i = inputTime(hour, min, sec); i >= 0 ; i--) {
                timeConverter(i);
            }

            System.out.println("\rIt's time to touch some grass dude!!1!!");

            System.out.println("Do you want to repeat the timer? (Y/N)");
            String repeat = scanner.next();
            if (!repeat.matches("[yY](es)?")) break;
            clearConsole();
        }




    }

    public static int inputTime(int inputHour, int inputMin, int inputSec) {
        while (true) {
            try {
                System.out.print("Please insert the Hour: ");
                inputHour = scanner.nextInt();
                System.out.print("Please insert the minutes: ");
                inputMin = scanner.nextInt();
                System.out.print("Please insert the seconds: ");
                inputSec = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                clearConsole();
                System.err.println("""
                    Error. The given input is invalid.
                    Please put a valid input. (Integer)
                    """);
                scanner.nextLine();
            }
        }


        return hourConverterToSec(inputHour) + minutesConverterToSec(inputMin) + inputSec;

    }

    public static int hourConverterToSec(int hour) {
        final int SEC_PER_HOUR = 60 * 60;
        return hour *= SEC_PER_HOUR;
    }

    public static int minutesConverterToSec(int minutes) {
        final int SEC_PER_MIN = 60;
        return minutes *= SEC_PER_MIN;
    }

    public static int timeConverter(int a) throws InterruptedException {
        int tempSec = a;
        int minutes = 0;
        int tempMin = 0;
        int hours = 0;
        int tempHour = 0;


        while (tempSec >= 3600) {
            hours++;
            tempSec -= 3600;
            tempHour = hours;
        } while (tempSec >= 60) {
            minutes++;
            tempSec -= 60;
            tempMin = minutes;
        }
        Thread.sleep(1000);
        System.out.printf("\rTime remaining: %02d : %02d : %02d" , tempHour, tempMin, tempSec);

        return a;
    }
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Could not clear console.");
        }
    }
}
