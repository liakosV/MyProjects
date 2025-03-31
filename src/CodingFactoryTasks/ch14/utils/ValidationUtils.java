package CodingFactoryTasks.ch14.utils;

public class ValidationUtils {
    private ValidationUtils() {}

    public static boolean isStringLengthValidate(String string) {
        return string.length() < 31 && !string.isEmpty();
    }

    public static boolean isIntLengthValidate(int num) {
        return num >= 1 && num <= 10;
    }
}
