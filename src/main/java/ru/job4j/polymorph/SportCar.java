package ru.job4j.polymorph;

public class SportCar implements Vehicle {

    @Override
    public void changeGear() {
        System.out.println("Manual Transmission. Turn on the first, then switch to the sixth");
    }

    @Override
    public void accelerate() {
        System.out.println("Electronic gas pedal");
    }

    @Override
    public void steer() {
        System.out.println("Shortened steering rack for faster steering");
    }

    @Override
    public void brake() {
        System.out.println("Reinforced braking system");
    }

    @Override
    public void refill() {
        System.out.println("Refill 100 L gas");
    }
}
