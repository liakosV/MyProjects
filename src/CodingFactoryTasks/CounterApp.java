package CodingFactoryTasks;

import java.util.Scanner;

/**
 * Counts steps up, distance down
 */
public class CounterApp {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            clearConsole();

            int distance;
            int steps = 0;
            Scanner in = new Scanner(System.in);

            System.out.print("\rGive the distance you want to travel: ");
            distance = in.nextInt();
            int sleepTime = 0;

            if (distance >= 25) {
                sleepTime = 100;
            } else if (distance >= 10) {
                sleepTime = 500;
            } else {
                sleepTime = 1000;
            }

            while (distance != 0) {
//            distance--;
//            steps++;
                System.out.printf("\rThe current distance is: %d, The steps you take is: %d", distance--, steps++);
                Thread.sleep(sleepTime);

            }



            System.out.println("\rYou arrived!");

            System.out.println("Do you want to travel again? (Y/N)");
            String replay = in.next();

            if (!replay.matches("[Yy](es)?")) {
                break;
            }
        }
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
