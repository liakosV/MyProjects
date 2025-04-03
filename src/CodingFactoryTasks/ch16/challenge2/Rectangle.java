package CodingFactoryTasks.ch16.challenge2;

import CodingFactoryTasks.ch16.challenge2.Interface.IRectangle;

import java.io.Serializable;
import java.util.Objects;

public class Rectangle extends AbstractShape implements IRectangle, Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.width;
        this.height = rectangle.height;
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

    @Override
    public double getCircumference() {
        return 2 * (width + height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getHeight());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Rectangle rectangle)) return false;
        return Double.compare(getWidth(), rectangle.width) == 0 && Double.compare(getHeight(), rectangle.height) == 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
