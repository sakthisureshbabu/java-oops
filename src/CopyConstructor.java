class Copy {
    // data members of the class
    String name;
    String id;

    // Parameterized Constructor
    Copy(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    Copy(Copy obj) {
        this.name = obj.name;
        this.id = obj.id;
    }
}

class CopyConstructor {
    public static void main(String []args) {
        // This would invoke the parameterized constructor
        System.out.println("First Object");
        Copy copy_1 = new Copy("Sakthi", "2626");
        System.out.println("Name: " + copy_1.name + " ID: " + copy_1.id);
        System.out.println();

        // This would invoke the copy constructor
        Copy copy_2 = new Copy(copy_1);
        System.out.println("Copy Constructor used Second object");
        System.out.println("Name: " + copy_2.name + " ID: " + copy_2.id);
    }
}