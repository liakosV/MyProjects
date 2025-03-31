package CodingFactoryTasks.speakingschool;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Alice");
        ISpeakable dog = new Dog("Bob");

        GenericSpeakingSchool speakingSchool = new GenericSpeakingSchool(cat);
        speakingSchool.learnToSpeak();

        doSpeak(cat);
        doSpeak(dog);

        cat.speak();
    }

    public static void doSpeak(ISpeakable speakable) {
        GenericSpeakingSchool speakingSchool = new GenericSpeakingSchool(speakable);
        speakingSchool.learnToSpeak();
    }

//    public static void doSpeak(ISpeakable iSpeakable) {
//        iSpeakable.speak();
//    }
}
