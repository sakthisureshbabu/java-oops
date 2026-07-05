package inheritance;

// Super class
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Subclass
class Car extends Vehicle {
    String brand = "Lamborghini";
    String model = "Aventador";
    long price = 393695;

    Car() {
        System.out.println("This Vehicle is a Car.");
    }

}


public class Single {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Brand: " + car.brand);
        System.out.println("Model: " + car.model);
        System.out.println("Price: " + car.price);
    }
}