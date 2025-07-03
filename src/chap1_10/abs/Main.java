package chap1_10.abs;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Tiger tiger = new Tiger();

        Pet[] pets = {dog, cat, tiger};
        for (Pet pet : pets) {
            pet.feed();
            pet.sleep();
        }

    }
}
