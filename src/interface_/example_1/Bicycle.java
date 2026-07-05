package interface_.example_1;

// Class implementing vehicle interface
class Bicycle implements Vehicle {
    int speed;
    int gear;

    //Change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    // Increase speed
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    // Decrease speed
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed:" + speed + " gear:" + gear);
    }
}