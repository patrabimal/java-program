package main.java.inheritance;

public class Car extends Vehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.topSpeed();
        System.out.println(car.age);

        Car car2 = (Car) new Vehicle();
        car2.startEngine();
        car2.topSpeed();

        Vehicle vehicle = new Car();
        vehicle.startEngine();
        //vehicle.topSpeed();

    }

    private void topSpeed() {
        startEngine();
    }
}
