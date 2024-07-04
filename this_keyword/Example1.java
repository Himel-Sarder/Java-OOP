class Animal {
    // Variables of superclass
    int numberOfDogs;
    int numberOfCats;

    // Constructor of superclass
    Animal(int numberOfDogs, int numberOfCats) {
        this.numberOfDogs = numberOfDogs;
        this.numberOfCats = numberOfCats;
        System.out.println("Animal constructor called");
    }


    String ownerName;

    // Constructor of subclass
    Animal(int numberOfDogs, int numberOfCats, String ownerName) {
        // Calling the superclass constructor
        this(numberOfDogs, numberOfCats);
        this.ownerName = ownerName;
        System.out.println("Dog constructor called");
    }

    
    void printMe() {
        // Calling the superclass method
        
        System.out.println("Owner Name : " + this.ownerName);
        System.out.println("Number of dogs : " + this.numberOfDogs);
        System.out.println("Number of cats : " + this.numberOfCats);
    }
}

public class Example1 {
    public static void main(String[] args) {
        // Creating an instance of the subclass
        Animal dog = new Animal(12, 23, "Himel Sarder");
        
        // Calling the subclass method to print details
        dog.printMe();
    }
}
