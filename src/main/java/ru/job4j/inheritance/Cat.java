package ru.job4j.inheritance;

public class Cat extends Animal {
    @Override
    public void instanceInvoke() {
        System.out.println("Cat SubClass Method");
    }

    public static void staticInvoke() {
        System.out.println("Cat Class Method");
    }
}
