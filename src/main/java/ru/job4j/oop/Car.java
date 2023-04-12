package ru.job4j.oop;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Engine running");
    }

    public class Transmission {

        public void accelerate() {
            System.out.println("Acceleration");
        }
    }

    public class Brakes {

        public void brake() {
            System.out.println("Braking");
        }
    }

    public class TripComputer {

        private String tripData = "On-board computer";

        private String model = "Model TripComputer";

        public void getInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Model TripComputer: " + this.model);
            System.out.println("Model Car: " + Car.this.model);
        }

        public static TripComputer getTripComputer() {
            Car car = new Car("Toyota", "Camry");
            Car.TripComputer tripComputer = car.new TripComputer();
            return tripComputer;
        }
    }
}
