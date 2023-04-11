package ru.job4j.oop;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean canDrive() {
        //age = 16;
        return this.age >= 18;
    }

    public static void main(String[] args) {
        User user1 = new User("Sasha", 21);
        System.out.println(user1.canDrive() + " " + user1.name + " " + user1.age);
    }
}
