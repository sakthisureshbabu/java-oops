package abstraction;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 2.40);
        Shape rectangle = new Rectangle("Green", 10.4, 6.2);

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
    }
}
