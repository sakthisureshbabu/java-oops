// super() - is used to call the constructor or methods or variables of the parent class. It is used to refer immediate parent class instance variable. 
// It is used to invoke the parent class constructor. It is used to access the method of the parent class.

package inheritance;

class Person {
    String name = "Suresh Babu";

    Person() {
        System.out.println("Person Constructor");
    }

    void display() {
        System.out.println("I am a Person");
    }
}

class Student extends Person {
    String name = "Sakthi";

    Student() {
        System.out.println("Student Constructor");
    }

    @Override
    void display() {
        super.display();
        System.out.println("I am a Student.");
    }

    void showNames() {
        System.out.println("Child Name: " + name);
        System.out.println("Parent Name: " + super.name);
    }
}

public class Super {
    public static void main(String[] args) {
        Student student = new Student();
        student.showNames();
        student.display();
    }
}
