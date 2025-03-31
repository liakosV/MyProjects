package CodingFactoryTasks.ch14;

import CodingFactoryTasks.ch14.utils.StringUtils;
import CodingFactoryTasks.ch14.utils.ValidationUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String string = "Hello";
        String palindrome = "Savvas";
        int[] arr = new int[]{2, 3, 4, 7, 3, 7, 9, 10};

        Logger.logMessage("Hello world");

        System.out.println("Max: " + MathHelper.maxFinder(arr));
        System.out.println("Min: " + MathHelper.minFinder(arr));
        System.out.println("Average: " + MathHelper.averageFinder(arr));

        System.out.println("The given string: " + string + ". In reverse will be: " + StringUtils.reverseString(string));
        System.out.println("The given string: " + string + ". In uppercase will be: " + StringUtils.uppercase(string));
        System.out.println("Is the given string: " + palindrome + ". Palindrome: " + StringUtils.isPalindrome(palindrome));

        System.out.println("(Returns true) Is the given string between 0 and 32 characters long: " + ValidationUtils.isStringLengthValidate("True"));
        System.out.println("(Returns false) Is the given string between 0 and 32 characters long: " + ValidationUtils.isStringLengthValidate(""));



        System.out.println("(Returns true) Is num between 1 to 10: " + ValidationUtils.isIntLengthValidate(5));
        System.out.println("(Returns false) Is num between 1 to 10: " + ValidationUtils.isIntLengthValidate(11));


    }
}
