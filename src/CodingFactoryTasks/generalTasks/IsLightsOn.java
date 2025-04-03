package CodingFactoryTasks.generalTasks;

import java.util.Scanner;

public class IsLightsOn {

    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        boolean isCarRunning = false;
        boolean isDark = false;
        boolean isRaining = false;
        int carSpeed;
        boolean LightOn = false;
        Scanner in = new Scanner(System.in);

        System.out.println("How km/h the car goes?");
        carSpeed = in.nextInt();
        System.out.println("Is it dark?");
        isDark = in.nextBoolean();
        System.out.println("Is Raining?");
        isRaining = in.nextBoolean();

        isCarRunning = carSpeed >= MAX_CAR_SPEED;
        LightOn = isDark  || (isRaining && isCarRunning) ;

        System.out.println("Is light on: " + LightOn);
    }





}
