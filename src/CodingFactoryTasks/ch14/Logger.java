package CodingFactoryTasks.ch14;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Logger {

    private Logger() {}

    public static void logMessage(String message) {
        System.err.println(message + " is made at: " + LocalDateTime.now());
    }
}
