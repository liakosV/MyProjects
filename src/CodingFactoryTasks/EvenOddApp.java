package CodingFactoryTasks;

public class EvenOddApp {

    public static void main(String[] args) {
        int num = 3;

        System.out.println("Is the num: " + num + "\nEven: " + isEven(num) + "\nOr \nOdd: " +  isOdd(num));

        for (int i = 1; i <= 10; i++) {
            System.out.println(facto(i));
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println(pow(i, 2));
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return !isEven(num);
    }

    public static int facto(int n) {
        return n <= 1 ? 1 : facto(n - 1) * n;
    }

    public static int pow(int b, int p) {
        return p == 0 ? 1 : pow(b, p - 1) * b;
    }
}
