package inheritance;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class - 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class - 2
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Child class - 3
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}

public class Hierarichal {
    public static void main(String[] args) {
        Animal animal;
        animal = new Animal();
        animal.sound();

        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();

        animal = new Cow();
        animal.sound();
    }
}
