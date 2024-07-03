// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    // Method overriding
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    // Additional method in subclass
    void wagTail() {
        System.out.println("Dog wags tail");
    }
}

class MethodOverridingExample {
    public static void main(String[] args) {
        

        Dog dog = new Dog();
        dog.makeSound();     // Outputs: Dog barks
        dog.wagTail();       // Outputs: Dog wags tail
        
        Animal animal = new Animal();
        animal.makeSound();  // Outputs: Animal makes a sound

        // Using superclass reference to refer to subclass object
        Animal anotherDog = new Dog();
        anotherDog.makeSound();  // Outputs: Dog barks
        // anotherDog.wagTail(); // Compilation error: Animal doesn't have wagTail method
    }
}
