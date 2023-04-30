package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Drive on bus");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Numbers: " + passengers);
    }

    @Override
    public double fuel(double fuel) {
        return fuel * 4;
    }
}
