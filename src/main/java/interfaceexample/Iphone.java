package main.java.interfaceexample;

public class Iphone implements Mobile{

    @Override
    public void display() {
        System.out.println("Display method");
    }
    @Override
    public void call() {
        System.out.println("Call method");
    }
}
