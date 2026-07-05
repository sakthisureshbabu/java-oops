package abstraction;

abstract class Shape {
    String color;

    // abstract method
    abstract double area();
    public abstract String toString();

    // constructor
    public Shape(String color) {
        System.out.println("Shape constructor.");
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
