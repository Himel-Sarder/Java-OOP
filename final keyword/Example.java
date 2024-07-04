// Final class example
final class Vehicle {
    // Final variable example
    final int maxSpeed = 120;

    // Final method example
    final void display() {
        System.out.println("This is a final method.");
    }

    // Method to show max speed
    void showMaxSpeed() {
        System.out.println("Max speed is: " + maxSpeed);
    }
}

// The following class declaration will cause an error because Vehicle is a final class
// class Car extends Vehicle {}

class Bike {
    // Final variable
    final int speedLimit;

    // Constructor
    Bike(int speed) {
        speedLimit = speed; // Assigning the final variable
    }

    // Final method
    final void display() {
        System.out.println("This is a final method in Bike class.");
    }

    void showSpeedLimit() {
        System.out.println("Speed limit is: " + speedLimit);
    }
}

// Class extending Bike to demonstrate final method usage
class RacingBike extends Bike {

    RacingBike(int speed) {
        super(speed);
    }

    // The following method declaration will cause an error because display() is a final method
    // void display() {
    //     System.out.println("Trying to override a final method.");
    // }
}

public class Example {
    public static void main(String[] args) {
        // Creating an instance of Vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.display();
        vehicle.showMaxSpeed();

        // Creating an instance of Bike
        Bike bike = new Bike(80);
        bike.display();
        bike.showSpeedLimit();

        // Creating an instance of RacingBike
        RacingBike racingBike = new RacingBike(150);
        racingBike.display();
        racingBike.showSpeedLimit();
    }
}
