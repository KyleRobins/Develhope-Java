package Exercises;

abstract class Vehicle {
    protected String type;
    protected int numberOfWheels;

    public Vehicle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public void showVehicleDetails() {
        System.out.println("Type: " + type);
        System.out.println("Number of Wheels: " + numberOfWheels);
    }

    public abstract void doVehicleSound();
}

class Car extends Vehicle {
    private int numberOfDoors;
    private double carPrice;

    public Car(int wheels, int doors, double price) {
        super("Car", wheels);
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Car sound: Vroom Vroom!");
    }
}

class Boat extends Vehicle {
    private double maxKnotsSpeed;
    private int boatKilosWeight;

    public Boat(double maxSpeed, int weight) {
        super("Boat", 0);
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Boat sound: Honk Honk!");
    }

    public String getBoatWeightAndSpeed() {
        return "Weight: " + boatKilosWeight + " kilos\n" +
                "Max Speed: " + maxKnotsSpeed + " knots";
    }
}

public class VehicleTester {
    public static void main(String[] args) {
        Car car = new Car(4, 4, 25000.0);
        Boat boat = new Boat(30.5, 5000);

        car.showVehicleDetails();
        car.doVehicleSound();

        System.out.println();

        boat.showVehicleDetails();
        boat.doVehicleSound();
        System.out.println(boat.getBoatWeightAndSpeed());
    }
}
