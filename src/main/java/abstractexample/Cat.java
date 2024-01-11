package main.java.abstractexample;

public class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat sound is Meow");
    }

    @Override
    public void maintenance(){
        System.out.println("Less maintenance for Cat");
    }

}
