interface Vehicle {
    void start(); // abstract method

    // Default method (optional for implementing classes)
    default void stop() {
        System.out.println("Vehicle stopped.");
    }

    // Static method (called using interface name)
    static void service() {
        System.out.println("Vehicle is being serviced.");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key ignition.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with a kick.");
    }

    // Overriding default method (optional)
    public void stop() {
        System.out.println("Bike stopped using hand brake.");
    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();

        // Calling static method from interface
        Vehicle.service();
    }
}
