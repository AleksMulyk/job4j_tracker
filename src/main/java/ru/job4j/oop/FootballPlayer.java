package ru.job4j.oop;

public class FootballPlayer extends Sportsman {
    @Override
    void run() {
        System.out.println("Average run speed");
    }

    public void footKick() {
        System.out.println("Kick the ball by foot");
    }
}
