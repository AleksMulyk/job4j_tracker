package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        String message = condition ? "Ball was eaten" : "Ball has run";
        System.out.println(message);
    }
}
