class Load {

    
    // Constructor with one argument
    Load(String name) {
        System.out.println("Constructor with one string argument " + name);
    }

    // Constructor with two arguments
    Load(String name, int age) {
        System.out.println("Constructor with two arguments: ");
        System.out.println("String argument: " + name);
        System.out.println("Integer arugment: " + age);
    }

    // Constructor with one argument but with different signature
    Load(long id) {
        System.out.println("Constructor with one argument: " + id);
    }
}

public class ConstructorOverload {
    public static void main(String []args) {
        Load load_1 = new Load("Sakthi", 25);
        Load load_2 = new Load("The Batman");
        Load load_3 = new Load(349459033);
    }
}