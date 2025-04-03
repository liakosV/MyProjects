package CodingFactoryTasks.generalTasks;

public class PowerApp {

    public static void main(String[] args) {
        long a = 2;
        long b = 10;

        System.out.println(pow(a, b));


    }


    /**
     * Calculates a^n
     *
     * @param a the base.
     * @param b the power.
     * @return the base raised to power.
     */
    public static long pow(long a, long b) {
//        long result = 1;
//        for (int i = 1; i <= b; i++) {
//            result *= a;
//        }
//        return result;

        return (long) Math.pow(a, b);
    }
}
