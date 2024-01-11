package main.java.abstractionandencapsulation;

public class Bike {
    private String modelName;
    private int power;
    private int price;

    Bike(String modelName, int price, int power) {
        this.modelName = modelName;
        this.power = power;
        this.price = price;
    }

    public void BikeInfo() {
        System.out.println("Bike Model is, " + modelName + " Power of this bike is " + power + " And Price for this bike is " + price);
    }

    public String BikeType() {
        if (power>400){
            return "This is a Super Bike";
        } else if (power>=150 & power<400) {
            return "This is a Sports Bike";
        }else if (power>=100 & power<150){
            return "This is a Normal Bike";
        }else {
            return "This is a Scooter";
        }
    }
}


