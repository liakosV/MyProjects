package CodingFactoryTasks.ch16.challenge2;

import CodingFactoryTasks.ch16.challenge2.Interface.ICircle;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ICircle, Cloneable, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Circle circle) {
        this.radius = circle.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return 2 * getRadius();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return Math.PI * getDiameter();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle circle)) return false;
        return Double.compare(getRadius(), circle.getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRadius());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
