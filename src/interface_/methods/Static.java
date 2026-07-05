package interface_.methods;

interface StaticInterface {
    final int a = 10;
    static void display() {
        System.out.println("Static method in interface");
    }
}

class Static implements StaticInterface {
    public static void main(String[] args) {
        // Calling static method using interface name instead instantiating.
        StaticInterface.display();
        System.out.println("Value of a: " + StaticInterface.a);
    }
}