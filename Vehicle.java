package Demo;

// Abstract class: Vehicle
abstract class Vehicle {
    // Abstract method to be implemented by subclasses
    abstract void move();

    // Common method for all vehicles
    void fuelType() {
        System.out.println("This vehicle uses petrol.");
    }
}

// Subclass 1: Car
class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car is moving on the road.");
    }
}

// Subclass 2: Bike
class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("The bike is moving on two wheels.");
    }
}

// Subclass 3: Truck
class Truck extends Vehicle {
    @Override
    void move() {
        System.out.println("The truck is moving, carrying heavy load.");
    }
}

// Main class to test the system
 class VehicleTest {
    public static void main(String[] args) {
        // Create instances of each subclass
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        Vehicle myTruck = new Truck();

        // Call the move() method for each
        myCar.move();
        myCar.fuelType();

        myBike.move();
        myBike.fuelType();

        myTruck.move();
        myTruck.fuelType();
    }
}