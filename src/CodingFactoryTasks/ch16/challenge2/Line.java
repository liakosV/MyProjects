package CodingFactoryTasks.ch16.challenge2;

import CodingFactoryTasks.ch16.challenge2.Interface.ILine;

import java.io.Serializable;
import java.util.Objects;

public class Line extends AbstractShape implements ILine, Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private double length;

    public Line() {}

    public Line(double length) {
        this.length = length;
    }

    public Line(Line line) {
        this.length = line.length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getLength());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line line)) return false;
        return Double.compare(getLength(), line.getLength()) == 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
