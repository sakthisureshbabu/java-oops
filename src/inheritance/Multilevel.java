package inheritance;

class Vehicle {
    Vehicle() {
        System.out.println("This is a vehicle");
    }
}

class Fourwheeler extends Vehicle {
    Fourwheeler() {
        System.out.println("This is a four wheeler vehicle");
    }
}

class Car extends Fourwheeler {
    Car() {
        System.out.println("This is a car");
    }
}

public class Multilevel {
    Car car = new Car();
}
