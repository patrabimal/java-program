package main.java.abstractexample;

public class ChildAnimal{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.sound();
        dog.maintenance();

        Cat cat=new Cat();
        cat.sound();
        cat.maintenance();

    }
}
