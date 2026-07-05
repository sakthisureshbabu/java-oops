package interface_.methods;

interface Vehicle {
    private void startEngine() {
        System.out.println("Engine started.");
    }

    default void drive() {
        startEngine();
        System.out.println("Driving the vehicle.");
    }
}

class Car implements Vehicle {
    
}

public class Private {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}