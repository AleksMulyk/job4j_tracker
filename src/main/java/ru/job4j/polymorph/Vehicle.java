package ru.job4j.polymorph;

public interface Vehicle extends Fuel {
    int WHEELS = 4;

    void accelerate();

    void brake();

    void steer();

    void changeGear();

    static void getDragCoefficient() {
        System.out.println("The formula for calculating the coefficient of aerodynamic drag of a car");
    }

    default void chargeBattery() {
        System.out.println("Battery under the hood. Charge.");
    }
}
