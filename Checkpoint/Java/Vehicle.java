package Java;
import java.util.ArrayList;
import java.util.List;

class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a motorcycle.");
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle());
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());

        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
        }
    }
}
