class Animal {
    // Variable of superclass
    int numberOfdogs = 12;

    // Method of superclass
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Variable of subclass
    int numberOfdogs = 22;

    // Method of subclass
    void makeSound() {
        // Calling the superclass method
        super.makeSound();
        System.out.println("Dog barks");
    }

    void displayNumberOfDogs() {
        // Accessing the superclass variable
        System.out.println("Number of dogs in superclass: " + super.numberOfdogs);
        System.out.println("Number of dogs in subclass: " + this.numberOfdogs);
    }
}

public class access_variable {
    public static void main(String[] args) {
        // Creating an instance of the subclass
        Dog dog = new Dog();

        // Calling the subclass method
        dog.makeSound();

        // Displaying the number of dogs
        dog.displayNumberOfDogs();
    }
}
