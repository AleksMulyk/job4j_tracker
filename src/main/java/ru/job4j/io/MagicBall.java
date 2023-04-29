package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("I am a grand wizard. What do you want to know?");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 1 -> System.out.println("Yes");
            case 2 -> System.out.println("No");
            default -> System.out.println("May be");
        }
    }
}
