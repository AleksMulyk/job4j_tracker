package ru.job4j.io;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Games.");
            System.out.println("1. Tanks");
            System.out.println("2. Super Mario");
            System.out.println("3. Quit");
            System.out.print("Input menu point to start the game: ");
            int select = Integer.parseInt(input.nextLine());
            if (select == 3) {
                System.out.println("Game is over.");
                run = false;
            } else if (select == 1) {
                System.out.println("Tanks loading ... ");
            } else if (select == 2) {
                System.out.println("Super Mario loading ... ");
            } else {
                System.out.println("There is no that game.");
            }
            System.out.println();
        }
    }
}
