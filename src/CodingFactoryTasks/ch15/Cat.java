package CodingFactoryTasks.ch15;

public class Cat extends Animal {

    public Cat() {

    }

    public Cat(String name, int age) {
        super(name, age);
    }


    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Age: " + getAge() + ", Name: " + getName();
    }
}
