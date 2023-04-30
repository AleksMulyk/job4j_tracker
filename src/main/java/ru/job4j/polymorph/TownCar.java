package ru.job4j.polymorph;

public class TownCar implements Vehicle {

    @Override
    public void changeGear() {
        System.out.println("Transmission automatic. Put the selector in mode D");
    }

    @Override
    public void accelerate() {
        System.out.println("Pressing the gas pedal mechanically opens the throttle");
    }

    @Override
    public void steer() {
        System.out.println("Standard steering");
    }

    @Override
    public void brake() {
        System.out.println("Standard braking system");
    }

    @Override
    public void refill() {
        System.out.println("Refill 60 L gas");
    }
}
