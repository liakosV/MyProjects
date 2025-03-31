package CodingFactoryTasks.ch16.challenge1;

import CodingFactoryTasks.ch16.challenge1.interfac.IShape;

public abstract class AbstractShape implements IShape {
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }
}
