package CodingFactoryTasks.clone;

public class Trainee  implements Cloneable{
    private String description;
    private City city;

    public Trainee() {}

    public Trainee(String description, City city) {
        this.description = description;
        this.city = city;
    }

    public Trainee(Trainee trainee) {
        this.description = trainee.description;
        this.city = new City(trainee.getCity());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public String toString() {
        return "Trainee{" +
                "description='" + description + '\'' +
                ", city=" + city +
                '}';
    }
}
