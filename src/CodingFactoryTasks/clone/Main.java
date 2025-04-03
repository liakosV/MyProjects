package CodingFactoryTasks.clone;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        City city = new City("Athens");
        City clonedCity = new City(city);

        Trainee alice = new Trainee("alice", city);
        Trainee cloneAlice = new Trainee(alice);



//        City city = new City("Thessaloniki");
//        City clonedCity = (City) city.clone();
//
//        Trainee alice = new Trainee("Alice", new City("Athens"));
//        Trainee cloneAlice = (Trainee) alice.clone();


        clonedCity.setDescription("Kalamata");

        alice.setCity(clonedCity);

        cloneAlice.setCity(new City("Athens2"));
        cloneAlice.setDescription("Alice2");


        System.out.println(city);
        System.out.println(clonedCity);

        System.out.println(alice);
        System.out.println(cloneAlice);
    }
}
