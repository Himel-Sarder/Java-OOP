class Animal {
    // Variable of superclass
    int numberOfDogs;
    int numberOfCats;

    // Constructor of superclass
    Animal(int numberOfDogs, int numberOfCats) {
        this.numberOfDogs = numberOfDogs;
        this.numberOfCats = numberOfCats;
        System.out.println("Animal constructor called");
    }

    // Method of superclass
    void printMe() {
        System.out.println("Number of dogs : " + numberOfDogs);
        System.out.println("Number of cats : " + numberOfCats);
    }
}

class Dog extends Animal {
    // Variable of subclass
    String ownerName;

    // Constructor of subclass
    Dog(int numberOfDogs, int numberOfCats, String ownerName) {
        // Calling the superclass constructor
        super(numberOfDogs, numberOfCats);
        this.ownerName = ownerName;
        System.out.println("Dog constructor called");
    }

    @Override
    void printMe() {
        
        super.printMe();
        System.out.println("Owner Name : " + ownerName);
    }

}

public class Example {
    public static void main(String[] args) {
        // Creating an instance of the subclass
        Dog dog = new Dog(12, 23, "Himel Sarder");
        
        dog.printMe();
    }
}
