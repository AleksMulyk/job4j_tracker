package ru.job4j.inheritance;

public class HIdeExampleMain {
    public static void main(String[] args) {
        Animal cat0 = new Animal();
        Animal cat1 = new Cat();
        Cat cat2 = new Cat();
        cat0.staticInvoke();
        cat1.staticInvoke();
        cat2.staticInvoke();
        Animal.staticInvoke();
        Cat.staticInvoke();
    }
}
