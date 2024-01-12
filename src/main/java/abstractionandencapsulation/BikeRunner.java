package main.java.abstractionandencapsulation;

public class BikeRunner {
    public static void main(String[] args) {
        Bike honda = new Bike("Shine", 56000, 125);
        honda.BikeInfo();
        System.out.println(honda.BikeType());

        Bike suzuki = new Bike("Hayabusa", 400000, 700);
        suzuki.BikeInfo();
        System.out.println(suzuki.BikeType());

        Bike yamaha = new Bike("FZS", 150000, 160);
        yamaha.BikeInfo();
        System.out.println(yamaha.BikeType());

        Bike tvs = new Bike("Scooty-pep", 76000, 85);
        tvs.BikeInfo();
        System.out.println(tvs.BikeType());

    }

}
