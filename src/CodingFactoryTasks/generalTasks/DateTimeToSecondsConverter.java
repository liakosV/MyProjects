package CodingFactoryTasks.generalTasks;

import java.util.Scanner;

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int daysToSecondsConverter = 0;
        int hoursToSecondsConverter = 0;
        int minutesToSecondsConverter = 0;
        int secondsConverter = 0;
        final int DAYS_HOURS = 24;
        final int HOURS_MINUTES = 60;
        final int MINUTES_SECONDS = 60;
        Scanner in = new Scanner(System.in);

        System.out.print("Give Days: ");
        days = in.nextInt();
        System.out.print("Give Hours: ");
        hours = in.nextInt();
        System.out.print("Give Minutes: ");
        minutes = in.nextInt();
        System.out.print("Give Seconds: ");
        seconds = in.nextInt();

        daysToSecondsConverter = days * DAYS_HOURS * HOURS_MINUTES * MINUTES_SECONDS;
        hoursToSecondsConverter = hours * HOURS_MINUTES * MINUTES_SECONDS;
        minutesToSecondsConverter = minutes * MINUTES_SECONDS;

        secondsConverter = daysToSecondsConverter + hoursToSecondsConverter + minutesToSecondsConverter;

        System.out.printf("\nThe Given Date Time is converted to: %,d seconds." , secondsConverter);

    }
}
