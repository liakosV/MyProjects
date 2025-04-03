package CodingFactoryTasks.clone;

public class City implements Cloneable {
    private String description;

    public City() {}

    public City(String description) {
        this.description = description;
    }

    public City(City city) {
        this.description = city.description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return (City) super.clone();
//    }

    @Override
    public String toString() {
        return "City{" +
                "description='" + description + '\'' +
                '}';
    }
}
