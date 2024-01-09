package main.java.inheritance;

public class Bike {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.topSpeed();

        Car car = (Car) new Vehicle();
        car.startEngine();

       // Vehicle vehicle = new Bike();
       // vehicle.startEngine();

    }

    private void topSpeed() {
        //startEngine();
    }
}
