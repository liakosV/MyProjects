package CodingFactoryTasks.ch16.challenge1;

import CodingFactoryTasks.ch16.challenge1.interfac.ITowDimensional;

public class Rectangle extends AbstractShape implements ITowDimensional {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }
}
