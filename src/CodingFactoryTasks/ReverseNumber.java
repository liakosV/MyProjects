package CodingFactoryTasks;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        int temp = 0;
        int reversedNum = 0;


        System.out.println("Give an integer: ");
        inputNum = scanner.nextInt();
        temp = inputNum;

        while (inputNum != 0) {
            int digit = inputNum % 10;
            reversedNum =  digit + reversedNum * 10;
            inputNum /= 10;
        }
        System.out.println("The reversed number of " + temp + " is " + reversedNum);

    }
}
