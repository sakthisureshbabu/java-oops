package inheritance;

// Superclass
class Vehicle {
    void vehicleType() {
        System.out.println("This is a vehicle.");
    }
}

// Interface for fare
interface Fare {
    default void fareInfo() {
        System.out.println("Fare information");
    }
}

// Subclass 1:
class Car extends Vehicle {
    void carType() {
        System.out.println("This is a car.");
    }
}

// Subclass 2: Hybrid inheritance extends Vehicle and implements Fare
class Bus extends Vehicle implements Fare {
    void busType() {
        System.out.println("This is a Bus.");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Car car = new Car();
        car.vehicleType();
        car.carType();

        Bus bus = new Bus();
        bus.vehicleType();
        bus.busType();
        bus.fareInfo();
    }
}
