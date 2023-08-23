public class Vehicle {

    private String make;
    private String model;
    private double rentalPrice;

    public Vehicle(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public double calculateRentalCharges(int days) {
        return rentalPrice * days;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 50.0, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 30.0, 750);

        int rentalDays = 7;

        System.out.println("Car details:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Rental Price: $" + car.getRentalPrice());
        System.out.println("Rental Charges for " + rentalDays + " days: $" + car.calculateRentalCharges(rentalDays));
        System.out.println();

        System.out.println("Motorcycle details:");
        System.out.println("Make: " + motorcycle.getMake());
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Rental Price: $" + motorcycle.getRentalPrice());
        System.out.println("Rental Charges for " + rentalDays + " days: $" + motorcycle.calculateRentalCharges(rentalDays));
    }
}

class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String make, String model, double rentalPrice, int numberOfSeats) {
        super(make, model, rentalPrice);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}

class Motorcycle extends Vehicle {
    private int engineDisplacement;

    public Motorcycle(String make, String model, double rentalPrice, int engineDisplacement) {
        super(make, model, rentalPrice);
        this.engineDisplacement = engineDisplacement;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }
}
