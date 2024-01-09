package main.java.polymorphism;

public class Car extends Vehicle {

    @Override
    public void start(boolean isAutomatic) {

        System.out.println("Is the car automatic : " + isAutomatic);
    }
}
