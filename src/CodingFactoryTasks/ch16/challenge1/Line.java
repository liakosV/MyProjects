package CodingFactoryTasks.ch16.challenge1;

public class Line extends AbstractShape {
    public double length;

    public Line() {

    }

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
