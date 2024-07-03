// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void wagTail() {
        System.out.println("Dog wags tail");
    }
}

// Another child class inheriting from Animal
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }

    public void scratch() {
        System.out.println("Cat scratches");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal animal = new Animal();

        // Test if objects are instances of Animal or its subclasses
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal)); // true
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));       // true
        System.out.println("dog instanceof Cat: " + (dog instanceof Cat));       // false

        System.out.println("cat instanceof Animal: " + (cat instanceof Animal)); // true
        System.out.println("cat instanceof Dog: " + (cat instanceof Dog));       // false
        System.out.println("cat instanceof Cat: " + (cat instanceof Cat));       // true

        System.out.println("animal instanceof Animal: " + (animal instanceof Animal)); // true
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));       // false
        System.out.println("animal instanceof Cat: " + (animal instanceof Cat));       // false

        // Using instanceof with null reference
        Animal nullAnimal = null;
        System.out.println("nullAnimal instanceof Animal: " + (nullAnimal instanceof Animal)); // false
        System.out.println("nullAnimal instanceof Dog: " + (nullAnimal instanceof Dog));       // false
        System.out.println("nullAnimal instanceof Cat: " + (nullAnimal instanceof Cat));       // false
    }
}
