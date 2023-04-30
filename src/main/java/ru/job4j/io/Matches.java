package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Game Eleven");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "First Player" : "Second Player";
            System.out.println(player + " put number in from 1 to 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches <= Math.min(3, count)) {
                count -= matches;
                turn = !turn;
                System.out.println("Balance: " + count);
            } else {
                System.out.println("You have to put number in from 1 to 3 and no more than balance");
            }
        }
        if (!turn) {
            System.out.println("First Player Won");
        } else {
            System.out.println("Second Player Won");
        }
    }
}
