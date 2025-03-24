package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSums(int[] num, int target) {
        int[] result = new int[1];
        for (int i = 0; i < num.length; i++) {
            for (int j = 1 + i; j < num.length; j++) {
                if (num[j]  == target - num[i]) {
                    result = new int[]{i, j};
                }
            }
        }
       return result;
    }

    public static void main(String[] args) {

        System.out.println((Arrays.toString(twoSums(new int[]{2, 7, 11, 15}, 9))));

        System.out.println((Arrays.toString(twoSums(new int[]{3, 2, 4}, 6))));

        System.out.println((Arrays.toString(twoSums(new int[]{3, 3}, 6))));
    }
}
