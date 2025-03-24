package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeNumbers {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int sum = 0;

        if (x < 0) {
            return false;
        }

        while (x != 0) {
            int digit = x % 10;
            sum = sum * 10 + digit;
            x /= 10;
        }
        x = temp;

        return x == sum;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(20));
    }


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int temp = x;
//        int sum = 0;
//        boolean isPalindrome = false;
//
//        while (x != 0) {
//            int digit = x % 10;
//            sum = sum * 10 + digit;
//            x /= 10;
//        }
//
//        x = temp;
//
//        if (x == sum) {
//            isPalindrome = true;
//        }
//
//        System.out.println(isPalindrome);
//    }
}
