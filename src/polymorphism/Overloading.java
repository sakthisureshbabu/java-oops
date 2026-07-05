package polymorphism;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add(10, 20));
        System.out.println(cal.add(10, 20, 30));
        System.out.println(cal.add(10.53, 49.583));
    }
}
