package Abstraction;

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}


class Car extends Vehicle {
    void start() {
        System.out.println("Car starts");
    }

    void stop() {
        System.out.println("Car stops");
    }
}

class Boat extends Vehicle {
    void start() {
        System.out.println("Boat starts");
    }

    void stop() {
        System.out.println("Boat stops");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle boat = new Boat();

        car.start();
        car.stop();

        boat.start();
        boat.stop();
    }
}