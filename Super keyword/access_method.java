class Animal {
    // Method of superclass
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Method of subclass
    void makeSound() {
        // Calling the superclass method
        super.makeSound();
        System.out.println("Dog barks");
    }
}

public class access_method {
    public static void main(String[] args) {
        // Creating an instance of the subclass
        Dog dog = new Dog();
        
        // Calling the subclass method
        dog.makeSound();
    }
}
