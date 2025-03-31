package CodingFactoryTasks.ch13.Point;

public class PointXYZ {

    //Instances
    private double X;
    private double Y;
    private double Z;

    //Constructors
    public PointXYZ() {}

    public PointXYZ(double x, double y, double z) {
        X = x;
        Y = y;
        Z = z;
    }

    //Getters & Setters

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public double getZ() {
        return Z;
    }

    public void setZ(double z) {
        Z = z;
    }

    // API
    public double getXYDistance() {
        double x = this.X;
        double y = this.Y;

        return Math.sqrt(x) + Math.sqrt(y);
    }

    public double getYZDistance() {
        double y = this.Y;
        double z = this.Z;

        return Math.sqrt(y) + Math.sqrt(z);
    }

    public double getXZDistance() {
        double x = this.X;
        double z = this.Z;

        return Math.sqrt(x) + Math.sqrt(z);
    }

    public double getXYZDistance() {
        double x = this.X;
        double y = this.Y;
        double z = this.Z;

        return Math.sqrt(x) + Math.sqrt(y) + Math.sqrt(z);
    }
}
