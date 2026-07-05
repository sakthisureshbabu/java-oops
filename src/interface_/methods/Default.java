package interface_.methods;

interface DefaultInterface {
    final int a = 10;

    default void display() {
        System.out.println("Default method in interface");
    }
}

class Default implements DefaultInterface {
    public static void main(String[] args) {
        Default obj = new Default();
        obj.display();
    }
}