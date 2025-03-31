package CodingFactoryTasks.ch13.Point;

public class Main {

    public static void main(String[] args) {
        PointXYZ pointXYZ = new PointXYZ(1, 2, 3);



        System.out.println("The distance between the point X and point Y is: " + pointXYZ.getXYDistance());

        System.out.println("The distance between the point Y and point Z is: " + pointXYZ.getYZDistance());

        System.out.println("The distance between the point X and point Z is: " + pointXYZ.getXZDistance());

        System.out.println("The distance between the point X, point Y and point Z is: " + pointXYZ.getXYZDistance());
    }
}
