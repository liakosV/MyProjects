package CodingFactoryTasks.ch16.challenge2;

import CodingFactoryTasks.ch16.challenge2.Interface.IShape;

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
