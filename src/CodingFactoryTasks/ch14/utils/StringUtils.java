package CodingFactoryTasks.ch14.utils;

public class StringUtils {
    private StringUtils() {

    }

    public static String reverseString(String string) {
        String reversed = new StringBuilder(string).reverse().toString();

        return reversed;
    }

    public static String uppercase(String string) {
        return string.toUpperCase();
    }

    public static boolean isPalindrome(String string) {
        return string.equalsIgnoreCase(reverseString(string));
    }
}
