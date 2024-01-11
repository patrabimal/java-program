package main.java.abstractexample;

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog sound is bark");
    }

    @Override
    public void maintenance() {
        System.out.println("More maintenance for Dog");
    }
}
