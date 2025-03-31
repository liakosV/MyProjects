package CodingFactoryTasks.speakingschool;

public class Dog implements ISpeakable{
    String name;

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("woof");
    }
}
