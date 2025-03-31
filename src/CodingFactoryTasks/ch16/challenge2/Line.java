package CodingFactoryTasks.ch16.challenge2;

import CodingFactoryTasks.ch16.challenge2.Interface.ILine;

public class Line extends AbstractShape implements ILine {
    private double length;

    public Line() {}

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
