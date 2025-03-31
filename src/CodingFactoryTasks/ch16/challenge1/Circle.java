package CodingFactoryTasks.ch16.challenge1;

import CodingFactoryTasks.ch16.challenge1.interfac.ITowDimensional;

public class Circle extends AbstractShape implements ITowDimensional {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
