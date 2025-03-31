package CodingFactoryTasks.ch15;

public class Main {


    public static void main(String[] args) {
        Cat cat = new Cat("Tzoura", 2);
        Dog dog = new Dog("Miky", 5);
        Animal animal = new Animal();

        doSpeak(cat);
        doSpeak(dog);
        doSpeak(animal);

//        cat.speak();
//        dog.speak();
//        animal.speak();

        System.out.println(cat);
        System.out.println(dog);


    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
