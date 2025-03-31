package CodingFactoryTasks.ch14;

public class MathHelper {

    private MathHelper() {}

    public static int maxFinder(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    public static int minFinder(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i],min);
        }
        return min;
    }

    public static double averageFinder(int[] arr) {
        double average = arr[0];
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        return average / arr.length;
    }
}
