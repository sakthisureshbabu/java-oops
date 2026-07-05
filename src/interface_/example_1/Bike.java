package interface_.example_1;

// Class implementing vehicle interface
class Bike implements Vehicle {
    int speed;
    int gear;

    //Change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    // Increase speed
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    // Apply brakes
    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed:" + speed + "gear:" + gear);
    }
}